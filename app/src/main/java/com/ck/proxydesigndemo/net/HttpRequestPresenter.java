package com.ck.proxydesigndemo.net;

import java.util.Map;

public class HttpRequestPresenter implements HttpRequest {

    private HttpRequest httpRequest;

    private static volatile HttpRequestPresenter ourInstance;

    public static HttpRequestPresenter getInstance() {

        return ourInstance;
    }

    private HttpRequestPresenter(HttpRequest httpRequest) {

        this.httpRequest = httpRequest;

    }

    public static void init(HttpRequest httpRequest) {
        if (null == ourInstance) {
            synchronized (HttpRequestPresenter.class) {
                if (null == ourInstance) {
                    ourInstance = new HttpRequestPresenter(httpRequest);
                }
            }
        }
    }

    @Override
    public void get(String url, Map<String, String> params, ICallback callback) {
        httpRequest.get(url, params, callback);
    }

    @Override
    public void post(String url, Map<String, String> params, ICallback callback) {

        httpRequest.post(url, params, callback);
    }
}
