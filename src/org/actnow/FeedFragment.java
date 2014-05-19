package org.actnow;

import org.actnow.utils.BitmapWorkerTask;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FeedFragment extends Fragment implements View.OnClickListener {

    ImageView ivStory1 = null;
    ImageView ivStory2 = null;
    ImageView ivStory3 = null;
    ImageView ivSoulTaker1 = null;
    ImageView ivSoulTaker2 = null;
    ImageView ivSoulTaker3 = null;
    ImageView ivSoulTaker4 = null;
    ImageView ivSoulTaker5 = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feed, container, false);


        ivStory1 = (ImageView) view.findViewById(R.id.ivStory1);
        ivStory1.setOnClickListener(this);
        ivStory2 = (ImageView) view.findViewById(R.id.ivStory2);
        ivStory2.setOnClickListener(this);
        ivStory3 = (ImageView) view.findViewById(R.id.ivStory3);
        ivStory3.setOnClickListener(this);

        ivSoulTaker1 = (ImageView) view.findViewById(R.id.ivStorySoulTakers1);
        ivSoulTaker1.setOnClickListener(this);
        ivSoulTaker2 = (ImageView) view.findViewById(R.id.ivStorySoulTakers2);
        ivSoulTaker2.setOnClickListener(this);
        ivSoulTaker3 = (ImageView) view.findViewById(R.id.ivStorySoulTakers3);
        ivSoulTaker3.setOnClickListener(this);
        ivSoulTaker4 = (ImageView) view.findViewById(R.id.ivStorySoulTakers4);
        ivSoulTaker4.setOnClickListener(this);
        ivSoulTaker5 = (ImageView) view.findViewById(R.id.ivStorySoulTakers5);
        ivSoulTaker5.setOnClickListener(this);

        new BitmapWorkerTask(ivStory1, getActivity().getResources()).execute(R.drawable.anas_4);
        new BitmapWorkerTask(ivStory2, getActivity().getResources()).execute(R.drawable.anas2);
        new BitmapWorkerTask(ivStory3, getActivity().getResources()).execute(R.drawable.anas_3);
        new BitmapWorkerTask(ivSoulTaker1, getActivity().getResources()).execute(R.drawable.anas_1);
        new BitmapWorkerTask(ivSoulTaker2, getActivity().getResources()).execute(R.drawable.anas_1);
        new BitmapWorkerTask(ivSoulTaker3, getActivity().getResources()).execute(R.drawable.anas_1);
        new BitmapWorkerTask(ivSoulTaker4, getActivity().getResources()).execute(R.drawable.anas_1);
        new BitmapWorkerTask(ivSoulTaker5, getActivity().getResources()).execute(R.drawable.anas_1);
        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment fragment = null;
        int storyId = -1;
        String title = null;
        String source = null;

        switch (v.getId()) {
            case R.id.ivStory1:
                storyId = R.id.ivStory1;
                title = getResources().getString(R.string.storyTitle1);
                source = getResources().getString(R.string.storySource1);
                break;
            case R.id.ivStory2:
                storyId = R.id.ivStory2;
                title = getResources().getString(R.string.storyTitle2);
                source = getResources().getString(R.string.storySource2);
                break;
            case R.id.ivStory3:
                storyId = R.id.ivStory3;
                title = getResources().getString(R.string.storyTitle3);
                source = getResources().getString(R.string.storySource3);
                break;
            case R.id.ivStorySoulTakers1:
                storyId = R.id.ivStorySoulTakers1;
                title = getResources().getString(R.string.soulTakersTitle1);
                source = getResources().getString(R.string.storySourceAnas);
                break;
            case R.id.ivStorySoulTakers2:
                storyId = R.id.ivStorySoulTakers2;
                title = getResources().getString(R.string.soulTakersTitle2);
                source = getResources().getString(R.string.storySourceAnas);
                break;
            case R.id.ivStorySoulTakers3:
                storyId = R.id.ivStorySoulTakers3;
                title = getResources().getString(R.string.soulTakersTitle3);
                source = getResources().getString(R.string.storySourceAnas);
                break;
            case R.id.ivStorySoulTakers4:
                storyId = R.id.ivStorySoulTakers4;
                title = getResources().getString(R.string.soulTakersTitle4);
                source = getResources().getString(R.string.storySourceAnas);
                break;
            case R.id.ivStorySoulTakers5:
                storyId = R.id.ivStorySoulTakers5;
                title = getResources().getString(R.string.soulTakersTitle5);
                source = getResources().getString(R.string.storySourceAnas);
                break;
            default:
                break;
        }

        fragment = new DetailStoryFragment();

        //add bundle
        Bundle bundle = new Bundle();
        bundle.putInt("storyId", storyId);
        bundle.putString("title", title);
        bundle.putString("source", source);

        fragment.setArguments(bundle);
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
