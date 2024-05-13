const LFThread = require('./NativeLFThread').default;

export function multiply(a: number, b: number): number {
  return LFThread.multiply(a, b);
}

export function asyncFn(fn: Function, onFinshed: (result: any) => void): void {
  return LFThread.asyncFn(fn, onFinshed);
}
