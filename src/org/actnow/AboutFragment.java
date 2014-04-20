package org.actnow;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
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

        Bitmap arrow = BitmapFactory.decodeResource(getResources(), R.drawable.ic_action_reverse);
        ssb.setSpan(new ImageSpan(arrow), length - 29, length - 24, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView2.setText(ssb, TextView.BufferType.SPANNABLE);

        //create round image
        ImageView ivImage1 = (ImageView) rootView.findViewById(R.id.ivImage1);
        ivImage1.setImageBitmap(getRoundedBitmap(ivImage1.getDrawable()));

        ImageView ivImage2 = (ImageView) rootView.findViewById(R.id.ivImage2);
        ivImage2.setImageBitmap(getRoundedBitmap(ivImage2.getDrawable()));
        getActivity().setTitle("About");
        return rootView;
    }

    private Bitmap getRoundedBitmap(Drawable drawable) {

        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));

        float radius = 0.5f * Math.min(bitmap.getWidth(), bitmap.getHeight()) - 0.5f * paint.getStrokeWidth();

        Bitmap bitmapRounded = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());

        Canvas canvas = new Canvas(bitmapRounded);
        canvas.drawCircle(0.5f * bitmap.getWidth(), 0.5f * bitmap.getHeight(), radius, paint);

        Paint rPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rPaint.setColor(Color.RED);
        rPaint.setStyle(Paint.Style.STROKE);
        rPaint.setStrokeWidth(3);
        rPaint.setAntiAlias(true);

        radius = 0.5f * Math.min(bitmap.getWidth(), bitmap.getHeight()) - 0.5f * rPaint.getStrokeWidth();
        canvas.drawCircle(0.5f * bitmap.getWidth(), 0.5f * bitmap.getHeight(), radius, rPaint);

        return bitmapRounded;
    }
}