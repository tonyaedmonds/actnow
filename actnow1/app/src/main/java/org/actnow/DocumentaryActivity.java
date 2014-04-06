package org.actnow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DocumentaryActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_documentary);

//        getActionBar().setTitle("Documentary");
		initilizeView();
	}

	private void initilizeView() {
		Button signPettition = (Button) findViewById(R.id.btnDocSign);
        final TextView tvDocTitle = (TextView) findViewById(R.id.tvDocTitle);
        tvDocTitle.setText(Html.fromHtml(getResources().getString(R.string.doc_title)));

        signPettition.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("Starting activity for signPetition");
                final Intent intent = new Intent(getApplicationContext(),
                        PetitionActivity.class);
                intent.putExtra("title",tvDocTitle.getText().toString());
                startActivity(intent);
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
