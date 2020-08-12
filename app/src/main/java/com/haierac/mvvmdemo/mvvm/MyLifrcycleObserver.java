package com.haierac.mvvmdemo.mvvm;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLifrcycleObserver implements LifecycleObserver {
    private static final String TAG = "==MyLifrcycleObserver==";
    private Context context;
    private ICallback callback;

    public MyLifrcycleObserver(Context context, ICallback callback) {
        this.context = context;
        this.callback = callback;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void onStartTao() {
        Log.i(TAG, "onStartTao");
    }
}
