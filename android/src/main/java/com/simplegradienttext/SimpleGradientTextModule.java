package com.simplegradienttext;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = SimpleGradientTextModule.NAME)
public class SimpleGradientTextModule extends ReactContextBaseJavaModule {
  public static final String NAME = "SimpleGradientText";

  public SimpleGradientTextModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


}
