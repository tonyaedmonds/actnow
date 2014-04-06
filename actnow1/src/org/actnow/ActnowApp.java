package org.actnow;

import java.util.ArrayList;
import java.util.Calendar;

import android.content.Context;

public class ActnowApp {

	private static Context context;

	public static ArrayList<Story> getCannedStories() {
		ArrayList<Story> cannedStories = new ArrayList<Story>();

		Story story1 = new Story();
		story1.setAuthor("Anas Aremeyaw");
		story1.setDate(Calendar.getInstance().getTime());
		story1.setTitle("Spirit Child");
		story1.setSummary("An investigation into the ritual killing of disabled Ghanaian children deemed to be possessed by evil spirits.");
		story1.setStory(context.getResources().getString(
				R.string.spirit_child_story));
		story1.setSignatures("404");
		story1.setImage(context.getResources().getDrawable(
				R.drawable.spirit_child));
		cannedStories.add(story1);

		Story story2 = new Story();
		story2.setAuthor("Anas Aremeyaw");
		story2.setDate(Calendar.getInstance().getTime());
		story2.setTitle("Ghana’s Madhouse Story");
		story2.setSummary("Anas went undercover for seven months — as a baker, taxi driver and finally a mental patient — in and around Accra Psychiatric Hospital.");
		story2.setStory(context.getResources().getString(
				R.string.spirit_child_story));
		story2.setImage(context.getResources().getDrawable(
				R.drawable.spell_of_the_albino));
		story2.setSignatures("44");
		cannedStories.add(story2);

		Story story3 = new Story();
		story3.setAuthor("Anas Aremeyaw");
		story3.setDate(Calendar.getInstance().getTime());
		story3.setTitle("Spell of the Albino");
		story3.setSummary("Anas investigates atrocities faced by albinos in Tanzania.");
		story3.setStory(context.getResources().getString(
				R.string.spell_of_albino_story));
		story3.setImage(context.getResources().getDrawable(
				R.drawable.spell_of_the_albino));
		story3.setSignatures("40");
		cannedStories.add(story3);

		Story story4 = new Story();
		story4.setAuthor("Anas Aremeyaw");
		story4.setDate(Calendar.getInstance().getTime());
		story4.setTitle("The Messiah of Mentukwa'");
		story4.setSummary("...When Children Are Beaten, Denied School, Forced Into Marriage In The Name of Jesus Christ As Preparation for the End Time. I Went Undercover In The End Day Temple, Mentukwa as Joseph Christ. Where There is Defilement In The Church In The Name Of Prophecy");
		story4.setStory(context.getResources().getString(
				R.string.spirit_child_story));
		story4.setSignatures("13");
		story4.setImage(context.getResources().getDrawable(R.drawable.anas_1));
		cannedStories.add(story4);

		Story story5 = new Story();
		story5.setAuthor("Anas Aremeyaw");
		story5.setDate(Calendar.getInstance().getTime());
		story5.setTitle("Ghana: Journalist goes undercover to expose traffickers");
		story5.setSummary("Police in Ghana storm a camp being used to keep children in slavery after one journalist spent weeks infiltrating the traffickers. In this video, CNN correspondent Vlad Duthiers meets the journalist and asks the minister responsible for protecting children what the government is doing to help.");
		story5.setStory(context.getResources().getString(
				R.string.spirit_child_story));
		story5.setSignatures("1024");
		story5.setImage(context.getResources().getDrawable(
				R.drawable.anas_walking));
		cannedStories.add(story5);

		return cannedStories;
	}

	public static void setContext(Context context) {
		ActnowApp.context = context;
	}

	public static Context getContext() {
		return ActnowApp.context;
	}

}
