package org.actnow.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import org.actnow.R;

public class RobotoFont extends TextView {

    public final static int ROBOTO_SLAB_BOLD = 0;
    public final static int ROBOTO_SLAB_LIGHT = 1;
    public final static int ROBOTO_SLAB_REGULAR = 2;
    public final static int ROBOTO_SLAB_THIN = 3;

    public RobotoFont(Context context) {
        super(context);
    }

    public RobotoFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFont(context, attrs);
    }

    public RobotoFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initFont(context, attrs);
    }

    private void initFont(Context context, AttributeSet attrs) {
        if (!isInEditMode()) {
            TypedArray values = context.obtainStyledAttributes(attrs,
                    R.styleable.RobotoFonts);

            int typeface = values.getInt(R.styleable.RobotoFonts_typeface, 0);

            setTypeface(getType(context, typeface));
            values.recycle();
        }
    }

    public static Typeface getType(Context context, int typefaceValue) {
        Typeface typeface;
        switch (typefaceValue) {
            case ROBOTO_SLAB_BOLD:
                typeface = Typeface.createFromAsset(context.getAssets(),
                        "fonts/RobotoSlab-Bold.ttf");
                break;
            case ROBOTO_SLAB_LIGHT:
                typeface = Typeface.createFromAsset(context.getAssets(),
                        "fonts/RobotoSlab-Light.ttf");
                break;
            case ROBOTO_SLAB_REGULAR:
                typeface = Typeface.createFromAsset(context.getAssets(),
                        "fonts/RobotoSlab-Regular.ttf");
                break;
            case ROBOTO_SLAB_THIN:
                typeface = Typeface.createFromAsset(context.getAssets(),
                        "fonts/RobotoSlab-Thin.ttf");
                break;
            default:
                throw new IllegalArgumentException(
                        "Unknown `typeface` attribute value " + typefaceValue);
        }
        return typeface;
    }
}
