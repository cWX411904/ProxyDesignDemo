package com.ck.proxydesigndemo.image.picasso;

import android.app.Activity;
import android.widget.ImageView;

import com.ck.proxydesigndemo.image.ImageLoader;
import com.squareup.picasso.Picasso;

public class PicassoImageLoader implements ImageLoader {
    @Override
    public void displayImage(Activity activity, String imageUrl, ImageView imageView) {

        Picasso.get().load(imageUrl).into(imageView);
    }
}
