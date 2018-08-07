package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 9:40
 * @Description
 **/
public class ClassTypeCapture<T> {

  static class Building {

  }

  static class House extends Building {

  }

  Class<T> kind;

  public ClassTypeCapture(Class<T> kind) {
    this.kind = kind;
  }

  public boolean f(Object arg) {
    return kind.isInstance(arg);
  }

  public static void main(String[] args) {
    ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
    System.out.println(ctt1.f(new Building()));
    System.out.println(ctt1.f(new House()));

    ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
    System.out.println(ctt2.f(new Building()));
    System.out.println(ctt2.f(new House()));
  }
}
