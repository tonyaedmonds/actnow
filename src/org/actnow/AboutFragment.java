package org.actnow;

import org.actnow.utils.RobotoFont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup rootView = (ViewGroup) inflater.inflate(
				R.layout.fragment_about, container, false);

		// initializeView(rootView);
		return rootView;
	}

	private void initializeView(ViewGroup rootView) {
		TextView titleFont = (TextView) rootView
				.findViewById(R.id.tvAboutTitle);

		Typeface titleFontType = RobotoFont.getType(ActnowApp.getContext(),
				RobotoFont.ROBOTO_REGULAR);
		titleFont.setTypeface(titleFontType);

		Typeface stepFontType = RobotoFont.getType(ActnowApp.getContext(),
				RobotoFont.ROBOTO_LIGHT);

		TextView step1Font = (TextView) rootView.findViewById(R.id.tvSummary1);
		TextView step2Font = (TextView) rootView.findViewById(R.id.tvSummary2);

		step1Font.setTypeface(stepFontType);
		step2Font.setTypeface(stepFontType);
	}
}