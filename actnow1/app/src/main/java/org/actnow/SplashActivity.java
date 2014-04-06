package org.actnow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import org.actnow.utils.BitmapWorkerTask;

public class SplashActivity extends Activity {

	private static final long SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

//        ImageView ivSplash = (ImageView) findViewById(R.id.ivSplash);
//        new BitmapWorkerTask(ivSplash,getApplicationContext().getResources()).execute(R.drawable.splash_image);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				startActivity(new Intent(SplashActivity.this,
						MainActivity.class));
				finish();
			}
		}, SPLASH_TIME_OUT);
	}

}
