# react-native-lf-thread

Asynchronous Threading Tool Library for react-native

## Installation

```sh
npm install react-native-lf-thread
```

## Usage


```js
import { asyncFn } from 'react-native-lf-thread';

// ...
const bigDataComputing = (params) => {
  // ... do some heavy computing
  const results =  doSomething(params);
  return results;
}

 asyncFn(bigDataComputing, (results)=>{
   // Synchronizing data to the UI
   console.log(results);
 });
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
