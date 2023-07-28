# react-native-simple-gradient-text

Simple customizable gradient text component

## Installation

```sh
npm install react-native-simple-gradient-text
```



## Usage

```js
import { SimpleGradientText } from 'react-native-simple-gradient-text';

// ...

<SimpleGradientText
  text={'Hello, Gradient Text!'}
  colors={['#FF5733', '#32a852', '#2375ff']}
  positions={[0, 0.5, 1]}
  style={styles.text}
/>

```

## Typings
The following type definitions are available for the props:

```js
export type SimpleGradientTextViewProps = {
  style?: any;
  text: string;
  colors?: string[];
  positions?: number[];
};
```

## About
This module provides a React Native component to display text with a gradient effect on Android. It uses a native view, RCTSimpleGradientTextView, to achieve the gradient text effect.

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
