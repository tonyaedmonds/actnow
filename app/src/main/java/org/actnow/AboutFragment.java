package org.actnow;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_about, container, false);


        TextView textView2 = (TextView) rootView.findViewById(R.id.tvSwipeLeft);
        SpannableStringBuilder ssb = new SpannableStringBuilder(textView2.getText());
        int length = textView2.getText().length();
        String text = getResources().getString(R.string.swipeLeft2);

        Bitmap arrow = BitmapFactory.decodeResource(getResources(), R.drawable.ic_action_reverse);
        ssb.setSpan(new ImageSpan(arrow), length - 29, length - 24, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
//        ssb.append(text);
        textView2.setText(ssb, TextView.BufferType.SPANNABLE);

        if(ActnowApp.aboutViewed){
            textView2.setVisibility(TextView.GONE);
        }else{
            ActnowApp.aboutViewed = true;
        }

        //create round image
        ImageView ivImage1 = (ImageView) rootView.findViewById(R.id.ivImage1);
        ivImage1.setImageBitmap(getRoundedBitmap(ivImage1.getDrawable()));

        ImageView ivImage2 = (ImageView) rootView.findViewById(R.id.ivImage2);
        ivImage2.setImageBitmap(getRoundedBitmap(ivImage2.getDrawable()));

        return rootView;
    }

    private Bitmap getRoundedBitmap(Drawable drawable) {

        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        int radius = (bitmap.getHeight() - bitmap.getHeight() / 2);
        Bitmap bitmapRounded = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapRounded);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, radius, paint);

        Paint rPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rPaint.setColor(Color.RED);
        rPaint.setStyle(Paint.Style.STROKE);
        rPaint.setStrokeWidth(3);
        rPaint.setAntiAlias(true);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, radius, rPaint);
        return bitmapRounded;
    }

}