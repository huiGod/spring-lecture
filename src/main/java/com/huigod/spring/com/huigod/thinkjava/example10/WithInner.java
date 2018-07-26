package com.huigod.spring.com.huigod.thinkjava.example10;

/**
 * @Author TengH
 * @Date 2018/7/26 15:00
 * @Description
 **/
public class WithInner {

  WithInner() {
    System.out.println("hello WithInner()");
  }
  class Inner{

    Inner() {
      System.out.println("hello Inner()");
    }

  }

}
