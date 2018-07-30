package com.huigod.spring.com.huigod.thinkjava.example13;

/**
 * @Author TengH
 * @Date 2018/7/27 17:20
 * @Description
 **/
public class Replacing {

  public static String s = Splitting.knights;

  public static void main(String[] args) {
    System.out.println(s.replaceFirst("f\\w+", "located"));
    System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
  }

}
