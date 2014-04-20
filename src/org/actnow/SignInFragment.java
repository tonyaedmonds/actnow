package org.actnow;

import org.actnow.utils.MailService;
import org.actnow.utils.SignInDto;
import org.actnow.utils.ValidationUtil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInFragment extends Fragment implements TextWatcher,
		TextView.OnEditorActionListener, View.OnFocusChangeListener {
	Button btnLogin = null;
	EditText username = null;
	EditText password = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_login, container, false);

		username = ((EditText) view.findViewById(R.id.etUsername));
		username.addTextChangedListener(this);
		username.setOnEditorActionListener(this);

		password = ((EditText) view.findViewById(R.id.etPassword));
		password.addTextChangedListener(this);
		password.setOnEditorActionListener(this);
		password.setOnFocusChangeListener(this);

		btnLogin = (Button) view.findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (ValidationUtil.isEmailAddressValid(username)
						&& ValidationUtil.isFieldNotNull(password)) {

					MailService.sendEmailAsync(new SignInDto(username.getText()
							.toString(), password.getText().toString()));
					ActnowApp.setAuthenticated(true);
					FragmentPager fragment = new FragmentPager();
					Bundle bundle = new Bundle();
					bundle.putInt("page", 1);
					fragment.setArguments(bundle);
					loadFragment(fragment);
				}
			}
		});

		((Button) view.findViewById(R.id.btnCreateAccount))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						loadFragment(new FragmentSignup());
					}
				});

		return view;
	}

	private void loadFragment(Fragment fragment) {
		FragmentTransaction ft = getActivity().getSupportFragmentManager()
				.beginTransaction();
		ft.setCustomAnimations(R.anim.slide_left, R.anim.slide_left);
		ft.replace(R.id.container, fragment);
		ft.commit();
	}

	private void changeBackgroundIfPossible() {
		if (isNotInputFieldEmpty(username)) {
			ValidationUtil.addBlueBackground(getActivity(), username);
		} else {
			ValidationUtil.addGrayBackground(getActivity(), username);
		}
		if (isNotInputFieldEmpty(password)) {
			ValidationUtil.addBlueBackground(getActivity(), password);
		} else {
			ValidationUtil.addGrayBackground(getActivity(), password);
		}
	}

	private boolean isNotInputFieldEmpty(EditText editable) {
		return editable != null && editable.getText() != null
				&& editable.getText().length() > 0;
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {

	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		changeBackgroundIfPossible();
	}

	@Override
	public void afterTextChanged(Editable s) {

	}

	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		if (actionId == EditorInfo.IME_ACTION_NEXT) {
			validate();
		} else if (actionId == EditorInfo.IME_ACTION_DONE) {
			btnLogin.requestFocus();
		}
		return false;
	}

	private void validate() {
		if (ValidationUtil.isEmailAddressValid(username)) {
			username.setError(null);
			password.requestFocus();
		} else {
			username.setError("Please enter a valid email address");
		}
	}

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		if (R.id.etPassword == v.getId()) {
			validate();
		}
	}
}
