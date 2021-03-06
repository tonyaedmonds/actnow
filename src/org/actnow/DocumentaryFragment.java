package org.actnow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DocumentaryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_documentary, container, false);
        getActivity().setTitle("Documentary");
        initializeView(rootView);
        return rootView;
    }

    private void initializeView(ViewGroup rootView) {
        Button signPettition = (Button) rootView.findViewById(R.id.btnDocSign);
        final TextView tvDocTitle = (TextView) rootView.findViewById(R.id.tvDocTitle);
        tvDocTitle.setText(Html.fromHtml(getResources().getString(R.string.doc_title)));

        signPettition.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Starting activity for signPetition");
                final Intent intent = new Intent(getActivity(),
                        PetitionActivity.class);
                intent.putExtra("title", tvDocTitle.getText().toString());
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_top);
            }
        });
        ImageView playButton = (ImageView) rootView.findViewById(R.id.wallPaper);
        playButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri
                        .parse("https:/www.youtube.com/watch?v=dQe2oSq2rLg")));
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri
//                        .parse("http://vimeo.com/89383986")));
            }
        });

        getActivity().getSupportFragmentManager().beginTransaction()
                .add(R.id.fragmentPetitionTab, new FragmentTabs()).commit();
    }

}
