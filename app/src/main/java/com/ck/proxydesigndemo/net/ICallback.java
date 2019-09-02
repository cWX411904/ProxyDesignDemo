package com.ck.proxydesigndemo.net;

public interface ICallback {

    void onSuccess(String result);

    void onFailure(int code, Throwable throwable);
}
