package com.huigod.spring.com.huigod.thinkjava.example12;

/**
 * @Author TengH
 * @Date 2018/7/27 10:51
 * @Description
 **/
public class NeverCaught {

  static void f() {
    throw new RuntimeException("From f()");
  }

  static void g() {
    f();
  }

  public static void main(String[] args) {
    try {
      g();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
