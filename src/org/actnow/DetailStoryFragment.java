package org.actnow;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DetailStoryFragment extends Fragment {
    private FragmentTabHost mTabHost;
    TextView tvDetailStory = null;
    int storyId = -1;
    Handler handler;
    private ProgressBar pbLoadStory;
    private String enemies;
    private String mafia;
    private String face;

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
//        tvDetailStory.setText(Html.fromHtml(enemies));

        new LoadStoryAsyncTask().execute();

        final TextView detailStoryTitle = ((TextView) (rootView.findViewById(R.id.detailStoryTitle)));
        detailStoryTitle.setText(arguments.getString("title"));
        ((TextView) (rootView.findViewById(R.id.tvSource))).setText(arguments.getString("source"));

        Button btnSignPetitionDetail = ((Button) rootView.findViewById(R.id.btnSignPetitionDetail));
        btnSignPetitionDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),
                        PetitionActivity.class);
                intent.putExtra("title", detailStoryTitle.getText().toString());
                startActivity(intent);
                    getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom,R.anim.abc_slide_out_top);
            }
        });

        return rootView;
    }

    class LoadStoryAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    tvDetailStory.setText(Html.fromHtml(getStory()));
                    pbLoadStory.setVisibility(ProgressBar.GONE);
                }
            });
        }
    }

    private String getStory() {

        String story = null;
        switch (storyId) {
            case R.id.ivStory1:
                story = ActnowApp.getEnemiesOfTheNationStory(getResources());
                break;
            case R.id.ivStory2:
                story = ActnowApp.getChineseMafiaStory(getResources());
                break;
            case R.id.ivStory3:
                story = ActnowApp.getJournalistFaceToFaceStory(getResources());
                break;
            default:
                break;
        }
        return story;
    }


}
