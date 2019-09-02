package com.ck.proxydesigndemo.image.glide;

import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ck.proxydesigndemo.image.ImageLoader;

public class GlideImageLoader implements ImageLoader {



    @Override
    public void displayImage(Activity activity, String imageUrl, ImageView imageView) {
        Glide.with(activity).load(imageUrl).into(imageView);
    }
}
