import * as React from 'react';

import { StyleSheet, Text, View } from 'react-native';
import { SimpleGradientText } from 'react-native-simple-gradient-text';

export default function App() {
  return (
    <View style={styles.container}>
      <SimpleGradientText
        text={'Hello worl'}
        colors={['#fff000', '#0000ff', '#ff12ff', '#1ff011']}
        positions={[0, 0.5, 0.55, 1]}
      />
      <Text />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
