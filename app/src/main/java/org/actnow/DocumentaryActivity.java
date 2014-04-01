package org.actnow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class DocumentaryActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_documentary);

		initilizeView();
	}

	private void initilizeView() {
		Button signPettition = (Button) findViewById(R.id.btnDocSign);
		signPettition.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Starting activity for signPetition");
				startActivity(new Intent(getApplicationContext(),
						PetitionActivity.class));
			}
		});

		ImageView playButton = (ImageView) findViewById(R.id.playButton);
		playButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri
						.parse("http://vimeo.com/89383986")));
			}
		});
	}
}
