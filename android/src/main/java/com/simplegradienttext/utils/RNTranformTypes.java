package com.simplegradienttext.utils;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;

public class RNTranformTypes {

  public static String[] convertReadableArrayToStringArray(ReadableArray readableArray){
    String[] array = new String[readableArray.size()];
    for (int i = 0; i < readableArray.size(); i++) {
      array[i] = readableArray.getString(i);
    }

    return array;
  }



  public static float[] convertReadableArrayToFloatArray(ReadableArray readableArray) {
    if (readableArray == null) {
      return null;
    }

    int length = readableArray.size();
    float[] floatArray = new float[length];

    for (int i = 0; i < length; i++) {
      ReadableType type = readableArray.getType(i);
      floatArray[i] = getValueFromReadableArray(type, readableArray, i);
    }

    return floatArray;
  }

  private static float getValueFromReadableArray(ReadableType type, ReadableArray readableArray, int index) {
    if (type == ReadableType.Number) {
      return (float) readableArray.getDouble(index);
    }

    if (type == ReadableType.String) {
      return parseFloat(readableArray.getString(index));
    }

    return 0;
  }

  private static float parseFloat(String value) {
    try {
      return Float.parseFloat(value);
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}
