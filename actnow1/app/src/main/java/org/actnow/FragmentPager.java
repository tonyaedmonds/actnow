package org.actnow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by aodubela on 4/6/14.
 */
public class FragmentPager extends Fragment {

    private int currentPage = -1;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    public FragmentPager(){}

    public FragmentPager(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) view.findViewById(R.id.pager);
        mPagerAdapter = new StoryPagerAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        if(currentPage != -1) mPager.setCurrentItem(currentPage);
        return view;
    }

}
