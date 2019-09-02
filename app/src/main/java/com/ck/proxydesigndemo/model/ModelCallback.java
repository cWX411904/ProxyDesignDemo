package com.ck.proxydesigndemo.model;

import com.ck.proxydesigndemo.net.ICallback;
import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class ModelCallback<T> implements ICallback {

    @Override
    public void onSuccess(String result) {
        Class<? extends T> geneticClass = getGeneticClass(this);
        T t = new Gson().fromJson(result, geneticClass);

        //重定向到新的onSuccess
        onSuccess(t);
    }

    protected Class<? extends T> getGeneticClass(Object object) {

        //获得带有泛型的直接父类的Type
        Type genericSuperclass = object.getClass().getGenericSuperclass();

        //ParameterizedType带参数的类型 泛型
        return (Class<? extends T>) ((ParameterizedType)genericSuperclass).getActualTypeArguments()[0];
    }

    public abstract void onSuccess(T t);

    @Override
    public void onFailure(int code, Throwable throwable) {

    }
}
