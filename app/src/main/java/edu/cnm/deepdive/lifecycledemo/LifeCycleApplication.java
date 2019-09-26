package edu.cnm.deepdive.lifecycledemo;

import android.app.Application;
import android.util.Log;


public class LifeCycleApplication extends Application {
  public String LOG_TAG = "Lifecycle Log";

  @Override
  public void onCreate() {
    super.onCreate();
    Log.d(LOG_TAG,"LifeCycleApplication::onCreate");

  }
}
