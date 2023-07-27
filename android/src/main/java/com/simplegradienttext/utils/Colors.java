package com.simplegradienttext.utils;

import android.graphics.Color;

public class Colors {

  public static int hexToIntegerColor(String hexColor) {
    return Color.parseColor(hexColor);
  }

  public static int[] hexColorsToIntegerColors(String[] hexColors) {
    int[] integerColors = new int[hexColors.length];

    for (int i = 0; i < hexColors.length; i++) {
      integerColors[i] = hexToIntegerColor(hexColors[i]);
    }

    return integerColors;
  }

}
