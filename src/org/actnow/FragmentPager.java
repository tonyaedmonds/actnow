package org.actnow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentPager extends Fragment {

	private int currentPage = -1;
	private ViewPager mPager;
	private PagerAdapter mPagerAdapter;

	public FragmentPager() {
		Bundle bundle = new Bundle();
		bundle.putInt("page", currentPage);
		setArguments(bundle);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_pager, container, false);

		// Instantiate a ViewPager and a PagerAdapter.
		mPager = (ViewPager) view.findViewById(R.id.pager);
		mPagerAdapter = new StoryPagerAdapter(getActivity()
				.getSupportFragmentManager());
		mPager.setAdapter(mPagerAdapter);

		try {
			mPager.setCurrentItem(getArguments().getInt("page"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}

}
