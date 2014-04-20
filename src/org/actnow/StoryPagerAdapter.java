package org.actnow;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class StoryPagerAdapter extends FragmentStatePagerAdapter {

    private static final int NUM_PAGES = 2;

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
                fragment = new AboutFragment();
                break;
            case 1:
                fragment = new DocumentaryFragment();
                break;
            default:
                break;
        }
        return fragment;
    }
}
