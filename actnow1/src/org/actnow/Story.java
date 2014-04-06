package org.actnow;

import java.util.Date;

import android.graphics.drawable.Drawable;

public class Story {

	private String author;
	private String title;
	private Date date;
	private String summary;
	private String story;
	public String signatures;
	private Drawable imageDrawable;

	public Story() {
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSignatures() {
		return signatures;
	}

	public void setSignatures(String signatures) {
		this.signatures = signatures;
	}

	public Drawable getImage() {
		return imageDrawable;
	}

	public void setImage(Drawable imageDrawable) {
		this.imageDrawable = imageDrawable;
	}
}
