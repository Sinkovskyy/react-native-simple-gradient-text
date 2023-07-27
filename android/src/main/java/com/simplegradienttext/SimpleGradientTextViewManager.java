package com.simplegradienttext;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.simplegradienttext.utils.RNTranformTypes;
import com.simplegradienttext.views.SimpleGradientTextView;

public class SimpleGradientTextViewManager extends SimpleViewManager<SimpleGradientTextView> {

  public static final String REACT_CLASS = "RCTSimpleGradientTextView";
  ReactApplicationContext mCallerContext;

  public SimpleGradientTextViewManager(ReactApplicationContext reactContext) {
    mCallerContext = reactContext;
  }



  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @NonNull
  @Override
  protected SimpleGradientTextView createViewInstance(@NonNull ThemedReactContext context) {
    SimpleGradientTextView gradientTextView = new SimpleGradientTextView(context);
    return gradientTextView;
  }

  // Method to set the text
  @ReactProp(name = "text")
  public void setText(SimpleGradientTextView view, String text) {
    view.setText(text);
    view.updateGradient();
  }

  // Method to set the text
  @ReactProp(name = "positions")
  public void setPositions(SimpleGradientTextView view, ReadableArray positions) {
    float[] positionsArray = RNTranformTypes.convertReadableArrayToFloatArray(positions);
    view.setPositions(positionsArray);
  }

  // Method to set the text
  @ReactProp(name = "colors")
  public void setColors(SimpleGradientTextView view, ReadableArray colors) {
    String[] colorsArray = RNTranformTypes.convertReadableArrayToStringArray(colors);
    view.setStringColors(colorsArray);
  }


}
