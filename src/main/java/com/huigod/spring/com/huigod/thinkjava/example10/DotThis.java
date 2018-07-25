package com.huigod.spring.com.huigod.thinkjava.example10;

public class DotThis {

  class Inner {

    void set(OneInterface oneInterface) {
      System.out.println("Inner: " + this);
      System.out.println("Inner.Outter: " + DotThis.this);
      oneInterface.test();
    }
  }

  void test() {
    new Inner().set(() -> System.out.println("Outter: " + this));
  }

  public static void main(String[] args) {
    new DotThis().test();
  }

}
