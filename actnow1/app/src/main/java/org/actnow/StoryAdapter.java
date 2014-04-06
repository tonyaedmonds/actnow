package org.actnow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class StoryAdapter extends ArrayAdapter<Story> {

	public StoryAdapter(Context context, List<Story> stories) {
		super(context, 1, stories);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Story story = this.getItem(position);
		RelativeLayout layout = null;

//		if (convertView == null) {
//			LayoutInflater layoutInflater = LayoutInflater.from(getContext());
//			layout = (RelativeLayout) layoutInflater.inflate(
//					R.layout.story_item_listview, parent, false);
//		} else {
//			layout = (RelativeLayout) convertView;
//		}
//
//		ImageView imStory = (ImageView) layout.findViewById(R.id.ivImage);
//		TextView tvTitle = (TextView) layout.findViewById(R.id.tvTitle);
//		TextView tvSummary = (TextView) layout.findViewById(R.id.tvSummary);
//		TextView tvSignatures = (TextView) layout
//				.findViewById(R.id.tvSignatures);
//
//		imStory.setImageDrawable(story.getImage());
//		tvTitle.setText(story.getTitle());
//		tvSummary.setText(story.getSummary());
//		tvSignatures.setText(story.getSignatures());
		return layout;
	}
}
