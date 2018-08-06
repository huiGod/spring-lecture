package com.huigod.spring.com.huigod.thinkjava.example15;

import com.huigod.spring.com.huigod.thinkjava.example14.Automobile;

/**
 * @Author TengH
 * @Date 2018/8/3 9:39
 * @Description
 **/
public class Holder3<T> {
  private T a;

  public Holder3(T a) {
    this.a = a;
  }

  public T getA() {
    return a;
  }

  public void setA(T a) {
    this.a = a;
  }

  public static void main(String[] args) {
    Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
    Automobile a = h3.getA();
//    compile error
//    h3.setA(1);
  }
}
