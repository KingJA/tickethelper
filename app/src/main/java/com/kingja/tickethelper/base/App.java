package com.kingja.tickethelper.base;

import android.app.Application;
import android.content.Context;

import com.kingja.volleysir.VolleySir;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Description:TODO
 * Create Time:2018/5/10 14:20
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class App extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();


        initLogger();

        initVolleySir();
    }

    private void initLogger() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    private void initVolleySir() {
        VolleySir.getDefault().init(getApplicationContext());
    }

    public static Context getContext() {
        return context;
    }
}
