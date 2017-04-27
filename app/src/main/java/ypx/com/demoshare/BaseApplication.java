package ypx.com.demoshare;

import android.app.Application;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by Admin on 2017/4/13.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ShareSDK.initSDK(this);
    }
}
