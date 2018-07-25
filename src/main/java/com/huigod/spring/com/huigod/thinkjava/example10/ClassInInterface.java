package com.huigod.spring.com.huigod.thinkjava.example10;

public interface ClassInInterface {

  void howdy();

  class Test implements ClassInInterface {

    @Override
    public void howdy() {
      System.out.println("Howdy!");
    }

    public static void main(String[] args) {
      new Test().howdy();
    }
  }

}
