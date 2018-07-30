package com.huigod.spring.com.huigod.thinkjava.example13;

/**
 * @Author TengH
 * @Date 2018/7/27 14:05
 * @Description
 **/
public class Immutable {

  public static String upcast(String s) {
    return s.toUpperCase();
  }

  public static void main(String[] args) {
    String q = "hello";
    System.out.println(q);
    String qq = upcast(q);
    System.out.println(qq);
  }
}
