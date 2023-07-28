import React, { useState } from 'react';
import {
  requireNativeComponent,
  View,
  Text,
  type TextProps,
} from 'react-native';

import {
  type SimpleGradientTextViewProps,
  type SimpleGradientTextProps,
} from './types';
import { StyleSheet } from 'react-native';

const SimpleGradientTextView =
  requireNativeComponent<SimpleGradientTextViewProps>(
    'RCTSimpleGradientTextView'
  );

export const SimpleGradientText = ({ ...props }: SimpleGradientTextProps) => {
  const [height, setHeight] = useState(0);
  const [width, setWidth] = useState(0);

  const handleLayout: TextProps['onLayout'] = (event) => {
    const { width: lWidth, height: lHeight } = event.nativeEvent.layout;
    setWidth(lWidth);
    setHeight(lHeight);
  };

  return (
    <>
      <View>
        <Text style={[props.style, styles.text]} onLayout={handleLayout}>
          {props.text}
        </Text>
        <SimpleGradientTextView
          {...props}
          style={[props.style, { height, width }, styles.text]}
        />
      </View>
    </>
  );
};

export const styles = StyleSheet.create({
  text: {
    color: 'transparent',
  },
  gradientText: {
    position: 'absolute',
  },
});
