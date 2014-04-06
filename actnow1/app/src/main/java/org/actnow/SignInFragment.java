package org.actnow;

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

import java.util.regex.Pattern;

public class SignInFragment extends Fragment implements TextWatcher, TextView.OnEditorActionListener, View.OnFocusChangeListener {
    Button signupButton = null;
    EditText username = null;
    EditText password = null;

    private final static Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        getActivity().setTitle("Sign In");

        username = ((EditText) view.findViewById(R.id.etUsername));
        username.addTextChangedListener(this);
        username.setOnEditorActionListener(this);

        password = ((EditText) view.findViewById(R.id.etPassword));
        password.addTextChangedListener(this);
        password.setOnEditorActionListener(this);
        password.setOnFocusChangeListener(this);

        signupButton = (Button) view.findViewById(R.id.btnLogin);
        signupButton.setEnabled(false);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail(username.getText(), password.getText());
                ActnowApp.setAuthenticated(true);
                backToMain();
            }
        });

        return view;
    }

    private void backToMain() {
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.slide_left, R.anim.slide_left);
        ft.replace(R.id.container, new DocumentaryFragment());
        ft.commit();
    }

    private void sendEmail(Editable username, Editable password) {
    }

    private boolean isUsernameValid() {
        if (username != null && username.getText() != null && username.getText().length() > 0){
            return EMAIL_ADDRESS_PATTERN.matcher(username.getText().toString()).matches();
        }
        return false;
    }

    private void changeBackgroundIfPossible() {
        if (isNotInputFieldEmpty(username)) {
            addBlueBackground(username);
        } else {
            addGrayBackground(username);
        }
        if (isNotInputFieldEmpty(password)) {
            addBlueBackground(password);
        } else {
            addGrayBackground(password);
        }

        enableLoginButton(isUsernameValid() && isPasswordValid());
    }

    private void addGrayBackground(EditText editText) {
        editText.setBackgroundResource(R.drawable.shape_rect_stroke_gray);
        editText.setTextColor(getResources().getColor(R.color.app_gray));
    }

    private void addBlueBackground(EditText editText) {
        editText.setBackgroundResource(R.drawable.shape_rect_stroke_blue);
        editText.setTextColor(getResources().getColor(R.color.app_blue));
    }

    private boolean isNotInputFieldEmpty(EditText editable) {
        return editable != null && editable.getText() != null && editable.getText().length() > 0;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

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
            signupButton.requestFocus();
        }
        return false;
    }

    private void validate() {
        if(isUsernameValid()){
            username.setError(null);
            password.requestFocus();
        }else{
            username.setError("Please enter a valid email address");
        }
    }

    private void enableLoginButton(boolean enable) {
        if (enable) {
            signupButton.setBackgroundResource(R.drawable.shape_rect_solid_red);
            signupButton.setTextColor(getResources().getColor(R.color.app_white));
            signupButton.setEnabled(true);
        } else {
            signupButton.setBackgroundResource(R.drawable.shape_rect_stroke_gray);
            signupButton.setTextColor(getResources().getColor(R.color.app_gray));
            signupButton.setEnabled(false);
        }
    }

    public boolean isPasswordValid() {
        return password != null && password.getText().length() > 0;
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if(R.id.etPassword == v.getId()){
            validate();
        }
    }
}
