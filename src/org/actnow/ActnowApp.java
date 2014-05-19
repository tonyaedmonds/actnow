package org.actnow;

import android.app.Application;
import android.content.res.Resources;

public class ActnowApp extends Application{

    private static boolean authenticated;

    public static String getJournalistFaceToFaceStory(Resources resources){
        return resources.getString(R.string.journalist_face_to_face_with_chinese_sex_mafia);
    }

    public static String getChineseMafiaStory(Resources resources){
        return resources.getString(R.string.chinese_sex_mafia_busted);
    }
    public static String getEnemiesOfTheNationStory(Resources resources){
        return resources.getString(R.string.enemies_of_the_nation_story);
    }

    public static String getSoulTakers1Story(Resources resources){
        return resources.getString(R.string.soul_takers_1);
    }

    public static String getSoulTakers2Story(Resources resources){
        return resources.getString(R.string.soul_takers_2);
    }

    public static String getSoulTakers3Story(Resources resources){
        return resources.getString(R.string.soul_takers_3);
    }

    public static String getSoulTakers4Story(Resources resources){
        return resources.getString(R.string.soul_takers_4);
    }

    public static String getSoulTakers5Story(Resources resources){
        return resources.getString(R.string.soul_takers_5);
    }

    public static void setAuthenticated(boolean authenticated) {
        ActnowApp.authenticated = authenticated;
    }

    public static boolean isAuthenticated() {
        return authenticated;
    }

}
