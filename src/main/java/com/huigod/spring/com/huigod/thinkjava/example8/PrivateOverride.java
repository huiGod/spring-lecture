package com.huigod.spring.com.huigod.thinkjava.example8;

public class PrivateOverride {

  private String a = "hello";

  private void f() {
    System.out.println("private f()");
  }

  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
    System.out.println(po.a);
  }

}

class Derived extends PrivateOverride {

  private String a = "world";

  public void f() {
    System.out.println("public f()");
  }

}
