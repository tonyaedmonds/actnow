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

import org.actnow.utils.ValidationUtil;

import java.util.regex.Pattern;

public class SignInFragment extends Fragment implements TextWatcher, TextView.OnEditorActionListener, View.OnFocusChangeListener {
    Button signupButton = null;
    EditText username = null;
    EditText password = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        username = ((EditText) view.findViewById(R.id.etUsername));
        username.addTextChangedListener(this);
        username.setOnEditorActionListener(this);

        password = ((EditText) view.findViewById(R.id.etPassword));
        password.addTextChangedListener(this);
        password.setOnEditorActionListener(this);
        password.setOnFocusChangeListener(this);

        signupButton = (Button) view.findViewById(R.id.btnLogin);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ValidationUtil.isEmailAddressValid(username) && ValidationUtil.isFieldNotNull(password)) {
                    sendEmail(username.getText(), password.getText());
                    ActnowApp.setAuthenticated(true);
                    backToMain();
                }
            }
        });

        return view;
    }

    private void backToMain() {
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.slide_left, R.anim.slide_right);
        ft.replace(R.id.container, new FragmentPager(1));
        ft.commit();
    }

    private void sendEmail(Editable username, Editable password) {
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

//        ValidationUtil.enableButton(getActivity(), signupButton,
//                (ValidationUtil.isEmailAddressValid(username) && ValidationUtil.isFieldNotNull(password)));
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
