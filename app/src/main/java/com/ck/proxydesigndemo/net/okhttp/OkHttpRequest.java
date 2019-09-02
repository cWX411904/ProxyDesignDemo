package com.ck.proxydesigndemo.net.okhttp;

import com.ck.proxydesigndemo.net.HttpRequest;
import com.ck.proxydesigndemo.net.ICallback;

import java.util.Map;

public class OkHttpRequest implements HttpRequest {
    @Override
    public void get(String url, Map<String, String> params, ICallback callback) {

    }

    @Override
    public void post(String url, Map<String, String> params, ICallback callback) {

    }
}
