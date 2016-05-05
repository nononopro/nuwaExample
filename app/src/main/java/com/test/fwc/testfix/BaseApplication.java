package com.test.fwc.testfix;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by fanweichao on 2016/5/5.
 */
public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
        Log.e("nuwa",Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
