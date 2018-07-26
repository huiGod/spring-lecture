package com.huigod.spring.com.huigod.thinkjava.example10;

/**
 * @Author TengH
 * @Date 2018/7/26 15:01
 * @Description
 **/
public class InheritInner extends WithInner.Inner {

  InheritInner(WithInner withInner) {
    withInner.super();
    System.out.println("hello InheritInner()");
  }

  public static void main(String[] args) {
    WithInner withInner = new WithInner();
    InheritInner inheritInner = new InheritInner(withInner);
  }
}
