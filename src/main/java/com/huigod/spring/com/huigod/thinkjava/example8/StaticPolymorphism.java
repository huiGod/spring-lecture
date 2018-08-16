package com.huigod.spring.com.huigod.thinkjava.example8;

public class StaticPolymorphism {

  public static void main(String[] args) {
    StaticSuper sup = new StaticSub();
    System.out.println(sup.staticGet());
    System.out.println(sup.dynamicGet());
  }

}

class StaticSuper {

  private static int a = 1;
  private int b = 2;

  public StaticSuper() {
    System.out.println("hello");
  }

  public static String staticGet() {
    return "Base staticGet()";
  }

  public String dynamicGet() {
    return "Base dynamicGet()";
  }

}

class StaticSub extends StaticSuper {

  private static int a = 3;

  public static String staticGet() {
    return "Derived staticGet()";
  }

  public String dynamicGet() {
    return "Derived dynamicGet()";
  }
}
