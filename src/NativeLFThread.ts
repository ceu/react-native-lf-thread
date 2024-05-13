import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  multiply(a: number, b: number): number;

  asyncFn: (fn: Function, onFinshed: (result: any) => void) => void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('LFThread');
