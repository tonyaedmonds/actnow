package org.actnow;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class StoryPagerAdapter extends FragmentStatePagerAdapter {

	private static final int NUM_PAGES = 2;
	private AboutFragment aboutFragment;
	private StoryFragment storyFragment;

	public StoryPagerAdapter(FragmentManager supportFragmentManager) {
		super(supportFragmentManager);
	}

	@Override
	public int getCount() {
		return NUM_PAGES;
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = null;

		
		switch (position) {

		case 0:

			fragment = getAboutFragment();
			break;
		case 1:
			fragment = getStoryFragment();
			break;

		default:
			break;
		}
		return fragment;
	}

	private Fragment getAboutFragment() {
		if (aboutFragment == null) {
			aboutFragment = new AboutFragment();
		}
		return aboutFragment;
	}

	private Fragment getStoryFragment() {
		if (storyFragment == null) {
			storyFragment = new StoryFragment();
		}
		return storyFragment;
	}

}
