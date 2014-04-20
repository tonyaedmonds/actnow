package org.actnow;

import org.actnow.utils.MailService;
import org.actnow.utils.SignUpDto;
import org.actnow.utils.ValidationUtil;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentSignup extends Fragment {

	EditText tvFirstName;
	EditText tvLastName;
	EditText tvEmail;
	EditText tvPhoneNumber;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater
				.inflate(R.layout.fragment_signup, container, false);

		tvFirstName = (EditText) view.findViewById(R.id.tvFirstname);
		tvLastName = (EditText) view.findViewById(R.id.tvLastname);
		tvEmail = (EditText) view.findViewById(R.id.tvEmail);
		tvPhoneNumber = (EditText) view.findViewById(R.id.tvPhone);

		((Button) view.findViewById(R.id.btnSignUp))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						SignUpDto signUpDto = getSignUpDto();
						if (signUpDto != null) {
							MailService.sendSignUpEmail(signUpDto);
							FragmentPager fragment = new FragmentPager();
							Bundle bundle = new Bundle();
							bundle.putInt("page", 1);
							fragment.setArguments(bundle );
							loadFragment(fragment);
						} else {
							Toast.makeText(getActivity(),
									"All fields required for sign up",
									Toast.LENGTH_SHORT).show();
						}
					}
				});
		return view;
	}

	private SignUpDto getSignUpDto() {
		if (!ValidationUtil.isEmpty(tvFirstName)
				&& !ValidationUtil.isEmpty(tvLastName)
				&& !ValidationUtil.isEmpty(tvEmail)
				&& !ValidationUtil.isEmpty(tvPhoneNumber)) {
			return new SignUpDto(tvFirstName.getText().toString(), tvLastName
					.getText().toString(), tvEmail.getText().toString(),
					tvPhoneNumber.getText().toString());
		}
		return null;
	}

	private void loadFragment(Fragment fragment) {
		FragmentTransaction ft = getActivity().getSupportFragmentManager()
				.beginTransaction();
		ft.setCustomAnimations(R.anim.slide_left, R.anim.slide_left);
		ft.replace(R.id.container, fragment);
		ft.commit();
	}
}
