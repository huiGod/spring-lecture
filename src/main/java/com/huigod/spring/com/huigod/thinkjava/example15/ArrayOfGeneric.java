package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 13:45
 * @Description
 **/
public class ArrayOfGeneric {

  static class Generic<T> {

  }

  static final int SIZE = 100;
  static Generic<Integer>[] gia;

  public static void main(String[] args) {
    //compile error ClassCastException
//    gia = (Generic<Integer>[]) new Object[SIZE];
    gia = (Generic<Integer>[]) new Generic[SIZE];
    System.out.println(gia.getClass().getSimpleName());
    gia[0] = new Generic<>();
    //compile-time error
//    gia[1] = new Object();
    //compile-time error
//    gia[2] = new Generic<Double>();
  }

}
