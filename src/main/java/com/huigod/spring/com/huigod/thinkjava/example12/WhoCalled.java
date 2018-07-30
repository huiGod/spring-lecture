package com.huigod.spring.com.huigod.thinkjava.example12;

/**
 * @Author TengH
 * @Date 2018/7/27 10:25
 * @Description
 **/
public class WhoCalled {

  static void f() {
    try {
      throw new Exception();
    } catch (Exception e) {
      for (StackTraceElement ste : e.getStackTrace()) {
        System.out.println(ste.getMethodName());
      }
    }
  }

  static void g() {
    f();
  }

  static void h() {
    g();
  }

  public static void main(String[] args) {
    f();
    System.out.println("--------------------------------------------");
    g();
    System.out.println("--------------------------------------------");
    h();
  }
}
