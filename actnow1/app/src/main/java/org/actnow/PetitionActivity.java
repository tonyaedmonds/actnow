package org.actnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ShareActionProvider;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PetitionActivity extends ActionBarActivity implements TextWatcher {
    private ShareActionProvider mShareActionProvider;
    private String title = "title";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_petition);

        if(getIntent() != null && getIntent().getExtras() != null){
            title = getIntent().getStringExtra("title");
        }
        initializeView();
    }

    private void initializeView() {
        EditText tvFirstname = (EditText) findViewById(R.id.tvFirstname);
        EditText tvLastname = (EditText) findViewById(R.id.tvLastname);
        EditText tvCity = (EditText) findViewById(R.id.tvCity);

        final TextView tvFirstRequired = (TextView) findViewById(R.id.tvFirstRequired);
        final ImageView ivStateDropDown = (ImageView) findViewById(R.id.ivStateDropDown);

        ((TextView) findViewById(R.id.tvPetitionTitle)).setText(title);

        ((TextView) findViewById(R.id.tvNeverMind)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //
        // tvFirstname.setOnEditorActionListener(new OnEditorActionListener() {
        // @Override
        // public boolean onEditorAction(TextView v, int actionId,
        // KeyEvent event) {
        // boolean handled = false;
        // if (v.getText().length() > 0) {
        // tvFirstRequired.setVisibility(TextView.GONE);
        // } else {
        // tvFirstRequired.setVisibility(TextView.VISIBLE);
        // }
        // return false;
        // }
        // });


        // Get a reference to the AutoCompleteTextView in the layout
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.tvState);
        // Get the string array
        String[] countries = getResources().getStringArray(R.array.countries_array);
        // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        textView.setAdapter(adapter);

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
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //check if has focus then set background
//        if (count > 0) s.setBackgroundResource(R.drawable.shape_rect_stroke_blue);
//        else s.setBackgroundResource(R.drawable.shape_rect_stroke_gray);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
