import React from 'react';
import { Text } from 'react-native';

import { type SimpleGradientTextProps } from './types';

export const SimpleGradientText = ({ ...props }: SimpleGradientTextProps) => {
  return (
    <>
      <Text {...props} />
    </>
  );
};
