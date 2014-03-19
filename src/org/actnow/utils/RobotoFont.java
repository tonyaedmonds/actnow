package org.actnow.utils;

import org.actnow.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class RobotoFont extends TextView {

	public final static int ROBOTO_THIN = 0;
	public final static int ROBOTO_THIN_ITALIC = 1;
	public final static int ROBOTO_LIGHT = 2;
	public final static int ROBOTO_LIGHT_ITALIC = 3;
	public final static int ROBOTO_REGULAR = 4;
	public final static int ROBOTO_ITALIC = 5;
	public final static int ROBOTO_MEDIUM = 6;
	public final static int ROBOTO_MEDIUM_ITALIC = 7;
	public final static int ROBOTO_BOLD = 8;
	public final static int ROBOTO_BOLD_ITALIC = 9;
	public final static int ROBOTO_BLACK = 10;
	public final static int ROBOTO_BLACK_ITALIC = 11;

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
		case ROBOTO_THIN:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Thin.ttf");
			break;
		case ROBOTO_THIN_ITALIC:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-ThinItalic.ttf");
			break;
		case ROBOTO_LIGHT:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Light.ttf");
			break;
		case ROBOTO_LIGHT_ITALIC:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-LightItalic.ttf");
			break;
		case ROBOTO_REGULAR:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Regular.ttf");
			break;
		case ROBOTO_ITALIC:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Italic.ttf");
			break;
		case ROBOTO_MEDIUM:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Medium.ttf");
			break;
		case ROBOTO_MEDIUM_ITALIC:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-MediumItalic.ttf");
			break;
		case ROBOTO_BOLD:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Bold.ttf");
			break;
		case ROBOTO_BOLD_ITALIC:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-BoldItalic.ttf");
			break;
		case ROBOTO_BLACK:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-Black.ttf");
			break;
		case ROBOTO_BLACK_ITALIC:
			typeface = Typeface.createFromAsset(context.getAssets(),
					"fonts/Roboto-BlackItalic.ttf");
			break;
		default:
			throw new IllegalArgumentException(
					"Unknown `typeface` attribute value " + typefaceValue);
		}
		return typeface;
	}
}
