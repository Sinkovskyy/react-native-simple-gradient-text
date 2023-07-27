package com.simplegradienttext.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;


import androidx.appcompat.widget.AppCompatTextView;

import com.simplegradienttext.utils.Colors;


public class SimpleGradientTextView extends AppCompatTextView {

  private static final int DEFAULT_COLOR = Color.BLACK;

  private int[] colors = new int[] {DEFAULT_COLOR,DEFAULT_COLOR};
  private float[] positions = new float[] {0,1.0f};

  private int totalLetters = 0;


  public SimpleGradientTextView(Context context) {
    super(context);
    init();
  }

  public SimpleGradientTextView(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public SimpleGradientTextView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }


  // Set positions
  public void setPositions(float[] newPositions) {
    positions = newPositions;
  }


  // Set colors
  public void setColors(int[] newColors) {
    colors = newColors;
    optimizePosition();
    updateGradient();
  }


  // Set string hex colors
  public void setStringColors(String[] newStringColors) {
    int[] newColors = Colors.hexColorsToIntegerColors(newStringColors);

    setColors(newColors);
  }

  // Optimize colors
  private void optimizeColor() {
    if(colors.length == positions.length) return;

    int[] newColors = new int[positions.length];

    for(int i = 0; i < positions.length;i++){
      newColors[i] = colors[i];
    }

    colors = newColors;
  }

  @Override
  public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    // Get the text from the TextView
    String text = getText().toString();
    // Count the number of letters in the text
    int letterCount = countLetters(text);
    totalLetters = letterCount;
  }



  // Optimize positions
  private void optimizePosition() {
    if(colors.length == positions.length) return;

    float[] newPositions = new float[colors.length];

    for(int i = 0; i < colors.length;i++){
      newPositions[i] = 1.0f / colors.length;
    }

    positions = newPositions;
  }


  // Update gradient view
  public void updateGradient() {
    paintShader();
    invalidate(); // Refresh the view to apply the changes
  }


  // Init gradient view
  private void init() {
    paintShader();
  }

  private void paintShader() {

    Shader shader = new LinearGradient(0, 0, getTextSize() * totalLetters / 2, getTextSize(), colors,positions, Shader.TileMode.CLAMP);
    getPaint().setShader(shader);
  }

  // Function to count the number of letters in a given text
  private int countLetters(String text) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isLetter(c)) {
        count++;
      }
    }
    return count;
  }


}
