package com.huigod.spring.com.huigod.thinkjava.example14;

/**
 * @Author TengH
 * @Date 2018/8/2 16:56
 * @Description
 **/

class B implements A {

  @Override
  public void f() {

  }

  public void g() {

  }
}

public class InterfaceViolation {

  public static void main(String[] args) {
    A a = new B();
    a.f();
//    compile error
//    a.g();
    System.out.println(a.getClass().getName());
    if (a instanceof B) {
      B b = (B) a;
      b.g();
    }
  }
}
