package com.ck.proxydesigndemo.image;

import android.app.Activity;
import android.widget.ImageView;

public interface ImageLoader {

    void displayImage(Activity activity, String imageUrl, ImageView imageView);
}
