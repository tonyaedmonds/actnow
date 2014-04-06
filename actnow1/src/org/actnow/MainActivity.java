package org.actnow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	private static final String ABOUT_SCREEN_VIEWED = "about_screen_viewed";
	private ViewPager mPager;
	private PagerAdapter mPagerAdapter;
	public static final String PREFS_NAME = "aboutScreenPref";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ActnowApp.setContext(this);
		mPager = (ViewPager) findViewById(R.id.pager);
		mPagerAdapter = new StoryPagerAdapter(getSupportFragmentManager());
		mPager.setAdapter(mPagerAdapter);

		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean(ABOUT_SCREEN_VIEWED, true);
		editor.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public void onMenuClick(MenuItem item) {
		if (R.id.action_blog == item.getItemId()) {
			startActivity(new Intent(getApplicationContext(),
					BlogActivity.class));
		} else if (R.id.action_sign_in == item.getItemId()) {
			startActivity(new Intent(getApplicationContext(),
					SignInActivity.class));
		}
	}
}
