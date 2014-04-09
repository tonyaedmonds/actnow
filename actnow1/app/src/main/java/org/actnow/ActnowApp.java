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

    public static void setAuthenticated(boolean authenticated) {
        ActnowApp.authenticated = authenticated;
    }

    public static boolean isAuthenticated() {
        return authenticated;
    }

}
