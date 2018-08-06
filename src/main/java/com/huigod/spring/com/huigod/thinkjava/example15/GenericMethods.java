package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/3 11:53
 * @Description
 **/
public class GenericMethods {

  public <T> void f(T x) {
    System.out.println(x.getClass().getName());
  }

  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("");
    gm.f(1);
    gm.f(1.0);
    gm.f(1.0F);
    gm.f('c');
    gm.f(gm);
  }
}
