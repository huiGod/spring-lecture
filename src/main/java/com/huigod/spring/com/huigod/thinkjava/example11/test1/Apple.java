package com.huigod.spring.com.huigod.thinkjava.example11.test1;

/**
 * @Author TengH
 * @Date 2018/7/26 16:58
 * @Description
 **/
public class Apple {
  private static long counter;
  private final long id = counter++;
  public long id(){
    return id;
  }
}
