package com.example.moha.test1.HelperClasses;

import android.app.Application;
import android.content.Context;

/**
 * Created by MOHA on 15-Aug-17.
 */

public class AppContext extends Application {
    private static Context context;

    public void onCreate(){
        super.onCreate();
        AppContext.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return AppContext.context;
    }
}
