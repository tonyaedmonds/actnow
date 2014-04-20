package org.actnow;

import org.actnow.utils.MailService;
import org.actnow.utils.PetitionDto;
import org.actnow.utils.ValidationUtil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ShareActionProvider;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PetitionActivity extends ActionBarActivity implements TextWatcher,
		TextView.OnEditorActionListener, View.OnFocusChangeListener {
	private ShareActionProvider mShareActionProvider;
	private String title = "title";
	private EditText tvLastname;
	private EditText tvFirstname;
	private EditText tvCity;
	private Button btnSignPetition;
	private AutoCompleteTextView tvCountry;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_petition);

		if (getIntent() != null && getIntent().getExtras() != null) {
			title = getIntent().getStringExtra("title");
		}
		initializeView();
	}

	private void initializeView() {
		tvFirstname = (EditText) findViewById(R.id.tvFirstname);
		tvFirstname.addTextChangedListener(this);
		tvFirstname.setOnEditorActionListener(this);

		tvLastname = (EditText) findViewById(R.id.tvLastname);
		tvLastname.addTextChangedListener(this);
		tvLastname.setOnEditorActionListener(this);

		tvCity = (EditText) findViewById(R.id.tvCity);
		tvCity.addTextChangedListener(this);
		tvCity.setOnEditorActionListener(this);

		((TextView) findViewById(R.id.tvPetitionTitle)).setText(title);
		((TextView) findViewById(R.id.tvNeverMind))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						finish();
					}
				});

		btnSignPetition = ((Button) findViewById(R.id.btnSignPetition));
		btnSignPetition.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				PetitionDto petitionSignedDto = getPetitionSignedDto();
				if (petitionSignedDto != null) {
					Intent intent = new Intent(getApplicationContext(),
							PetitionSignedActivity.class);
					startActivity(intent);
					overridePendingTransition(R.anim.slide_left,
							R.anim.slide_left);
					MailService.sendPetitionSigned(petitionSignedDto);
					finish();
				} else {
					Toast.makeText(getApplicationContext(),
							"All fields required to sign petition",
							Toast.LENGTH_SHORT).show();
				}
			}
		});
		// Get a reference to the AutoCompleteTextView in the layout
		tvCountry = (AutoCompleteTextView) findViewById(R.id.tvCountry);
		// Get the string array
		String[] countries = getResources().getStringArray(
				R.array.countries_array);
		// Create the adapter and set it to the AutoCompleteTextView
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, countries);
		tvCountry.setAdapter(adapter);
		tvCountry.setOnFocusChangeListener(this);

	}

	protected PetitionDto getPetitionSignedDto() {
		if (!ValidationUtil.isEmpty(tvFirstname)
				&& !ValidationUtil.isEmpty(tvLastname)
				&& !ValidationUtil.isEmpty(tvCity)
				&& !ValidationUtil.isEmpty(tvCountry)) {
			return new PetitionDto(tvFirstname.getText().toString(), tvLastname
					.getText().toString(), tvCity.getText().toString(),
					tvCountry.getText().toString());
		}
		return null;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.petition, menu);

		// Set up ShareActionProvider's default share intent
		MenuItem shareItem = menu.findItem(R.id.action_share);
		mShareActionProvider = (ShareActionProvider) MenuItemCompat
				.getActionProvider(shareItem);
		mShareActionProvider.setShareIntent(getDefaultIntent());

		return super.onCreateOptionsMenu(menu);
	}

	private Intent getDefaultIntent() {
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		return intent;
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		validateFields();
	}

	@Override
	public void afterTextChanged(Editable s) {

	}

	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		if (actionId == EditorInfo.IME_ACTION_NEXT) {
			validate(v);
		} else if (actionId == EditorInfo.IME_ACTION_DONE) {
			validate(v);
			btnSignPetition.requestFocus();
		}
		return false;
	}

	private void validateFields() {
		validate(tvFirstname);
		validate(tvLastname);
		validate(tvCity);
		validate(tvCountry);
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		validate(v);
	}

	private void validate(View v) {
		if (v instanceof EditText) {
			if (((EditText) v).getText() != null
					&& ((EditText) v).getText().length() > 0) {
				((EditText) v).setError(null);
				ValidationUtil.addBlueBackground(this, ((EditText) v));
			}
		} else {
			((EditText) v).setError("Required field");
			ValidationUtil.addGrayBackground(this, ((EditText) v));
		}
	}

}
