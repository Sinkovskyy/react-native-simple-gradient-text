package com.simplegradienttext;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleGradientTextPackage implements ReactPackage {
  @NonNull
  @Override
  public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    return modules;
  }


  @Override
  public List<ViewManager> createViewManagers(
    ReactApplicationContext reactContext) {
    return Arrays.<ViewManager>asList(
      new SimpleGradientTextViewManager(reactContext)
    );
  }
}
