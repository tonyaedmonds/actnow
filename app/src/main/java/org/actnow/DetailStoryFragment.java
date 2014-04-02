package org.actnow;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DetailStoryFragment extends Fragment {
    private FragmentTabHost mTabHost;
    TextView tvDetailStory = null;
    int storyId = -1;
    Handler handler;
    View rootView = null;
    private ProgressBar pbLoadStory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_detail_story, container, false);
        handler = new Handler();

        pbLoadStory = (ProgressBar) rootView.findViewById(R.id.pbLoadStory);

        Bundle arguments = getArguments();
        storyId = arguments.getInt("storyId");

        tvDetailStory = ((TextView) (rootView.findViewById(R.id.tvDetailStory)));
        new LoadStoryAsyncTask().execute();


        ((TextView) (rootView.findViewById(R.id.detailStoryTitle))).setText( arguments.getString("title"));
        ((TextView) (rootView.findViewById(R.id.tvSource))).setText(arguments.getString("source"));

        return rootView;
    }

    class LoadStoryAsyncTask extends AsyncTask<Void, Void, Void> {

        String s = null;

        @Override
        protected Void doInBackground(Void... params) {
            s = getStory();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tvDetailStory.setText(s);
                    pbLoadStory.setVisibility(ProgressBar.GONE);
                }
            });
        }
    }

    private String getStory() {

        String story = null;
        switch (storyId) {
            case R.id.ivStory1:
                story = getResources().getString(R.string.enemies_of_the_nation_story);
                break;
            case R.id.ivStory2:
                story = ActnowApp.getChineseMafiaStory();
                break;
            case R.id.ivStory3:
                story = getString(R.string.journalist_face_to_face_with_chinese_sex_mafia);
                break;
            default:
                break;
        }
        return story;
    }

}
