package org.actnow.utils;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import org.actnow.R;

import java.util.regex.Pattern;

/**
 * Created by aodubela on 4/6/14.
 */
public class ValidationUtil {

    private final static Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$");

    public static void addBlueBackground(Activity activity, EditText editText) {
        editText.setBackgroundResource(R.drawable.shape_rect_stroke_blue);
        editText.setTextColor(activity.getResources().getColor(R.color.app_blue));
    }

    public static void addGrayBackground(Activity activity, EditText editText) {
        editText.setBackgroundResource(R.drawable.shape_rect_stroke_gray);
        editText.setTextColor(activity.getResources().getColor(R.color.app_gray));
    }

    public static boolean isEmailAddressValid(EditText editText) {
        if (editText != null && editText.getText() != null && editText.getText().length() > 0){
            return EMAIL_ADDRESS_PATTERN.matcher(editText.getText().toString()).matches();
        }
        return false;
    }

    public static boolean isFieldNotNull(EditText editText) {
        return editText != null && editText.getText().length() > 0;
    }

    public static void enableButton(Activity activity, Button button, boolean enable) {
        if (enable) {
            button.setBackgroundResource(R.drawable.shape_rect_solid_red);
            button.setTextColor(activity.getResources().getColor(R.color.app_white));
            button.setEnabled(true);
        } else {
            button.setBackgroundResource(R.drawable.shape_rect_stroke_gray);
            button.setTextColor(activity.getResources().getColor(R.color.app_gray));
            button.setEnabled(false);
        }
    }

}