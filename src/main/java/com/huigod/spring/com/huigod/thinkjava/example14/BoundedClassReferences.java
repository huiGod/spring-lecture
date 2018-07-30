package com.huigod.spring.com.huigod.thinkjava.example14;

public class BoundedClassReferences {

  public static void main(String[] args) {
    Class<? extends Number> bounded = int.class;
    bounded = double.class;
    bounded = Number.class;
  }

}
