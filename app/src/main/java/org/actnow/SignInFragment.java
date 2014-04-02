package org.actnow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignInFragment extends Fragment {
    Button signupButton;
    EditText username = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        username = ((EditText) view.findViewById(R.id.etUsername));
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                changeEditTextBackground(username, count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                validateUsername();
            }


        });

        signupButton = (Button) view.findViewById(R.id.btnLogin);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//        final EditText password = ((EditText) view.findViewById(R.id.etPassword));
//        password.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                changeEditTextBackground(password, count);
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

        return view;
    }

    private void validateUsername() {
        if (username != null && username.getText() != null &&
                username.getText().toString().matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+") && username.getText().length() > 0) {
            ActnowApp.setAuthenticated(true);
            changeButtonBackground();
        } else {
            username.setError("Please enter a valid email address");
        }
    }

    private void changeButtonBackground() {
        signupButton.setBackgroundResource(R.drawable.shape_rect_solid_red);
    }

    private void changeEditTextBackground(EditText s, int count) {
        if (count > 0) s.setBackgroundResource(R.drawable.shape_rect_stroke_blue);
        else s.setBackgroundResource(R.drawable.shape_rect_stroke_gray);
    }

}
