package com.huigod.spring.com.huigod.thinkjava.example10;

public class DotNew {

  public class Inner {

  }

  public static void main(String[] args) {
    DotNew dn = new DotNew();
    DotNew.Inner dni = dn.new Inner();
  }

}
