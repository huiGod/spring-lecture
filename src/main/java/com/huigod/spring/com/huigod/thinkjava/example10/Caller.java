package com.huigod.spring.com.huigod.thinkjava.example10;

public class Caller {

  private Incrementable callbackReference;

  Caller(Incrementable cbh) {
    callbackReference = cbh;
  }

  void go() {
    callbackReference.increment();
  }

}
