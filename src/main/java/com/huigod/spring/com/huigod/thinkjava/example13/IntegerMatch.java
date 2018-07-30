package com.huigod.spring.com.huigod.thinkjava.example13;

/**
 * @Author TengH
 * @Date 2018/7/27 15:24
 * @Description
 **/
public class IntegerMatch {

  public static void main(String[] args) {
    System.out.println("-1234".matches("-?\\d+"));
    System.out.println("5678".matches("-?\\d+"));
    System.out.println("+911".matches("-?\\d+"));
    System.out.println("+911".matches("(-|\\+)?\\d+"));
    System.out.println("+911".matches("([-+])?\\d+"));
  }

}
