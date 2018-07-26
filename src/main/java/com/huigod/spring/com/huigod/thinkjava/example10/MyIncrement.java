package com.huigod.spring.com.huigod.thinkjava.example10;

public class MyIncrement {

  public void increment() {
    System.out.println("Other operation");
  }

  static void f(MyIncrement myIncrement) {
    myIncrement.increment();
  }

}
