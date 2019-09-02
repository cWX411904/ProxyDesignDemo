package com.ck.proxydesigndemo.image;

import android.app.Activity;
import android.widget.ImageView;

public class ImageLoaderPresenter implements ImageLoader{

    private static volatile ImageLoaderPresenter instance;
    private ImageLoader imageLoader;

    private ImageLoaderPresenter(ImageLoader loader) {
        this.imageLoader = loader;
    }

    public static ImageLoaderPresenter getInstance() {
        return instance;
    }

    public static void init(ImageLoader loader) {
        if (instance == null) {
            synchronized (ImageLoaderPresenter.class) {
                if (instance == null) {
                    instance = new ImageLoaderPresenter(loader);
                }
            }
        }
    }

    @Override
    public void displayImage(Activity activity, String imageUrl, ImageView imageView) {

        this.imageLoader.displayImage(activity, imageUrl, imageView);
    }
}
