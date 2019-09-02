package com.ck.proxydesigndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.ck.proxydesigndemo.image.ImageLoaderPresenter;
import com.ck.proxydesigndemo.image.glide.GlideImageLoader;
import com.ck.proxydesigndemo.model.ModelCallback;
import com.ck.proxydesigndemo.model.WeatherInfo;
import com.ck.proxydesigndemo.net.HttpRequestPresenter;
import com.ck.proxydesigndemo.net.ICallback;
import com.ck.proxydesigndemo.net.async.AsyncHttpRequest;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpRequestPresenter.init(new AsyncHttpRequest());

        Map<String, String> params = new HashMap<>();
        params.put("city", "深圳");
        params.put("key", "");

        HttpRequestPresenter.getInstance().get("", params, new ModelCallback<WeatherInfo>() {
            @Override
            public void onSuccess(WeatherInfo weatherInfo) {

            }

            @Override
            public void onFailure(int code, Throwable throwable) {
                super.onFailure(code, throwable);
            }
        });


        ImageLoaderPresenter.init(new GlideImageLoader());

        ImageLoaderPresenter.getInstance().displayImage(this, "", new ImageView(this));
    }
}
