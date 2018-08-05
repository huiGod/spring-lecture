package com.huigod.spring.com.huigod.thinkjava.example15;

public class Manipulation {

  static class HasF {

    public void f() {
      System.out.println("Hasf.f()");
    }

  }

  static class Manipulator<T> {

    private T obj;

    public Manipulator(T x) {
      this.obj = x;
    }

    public void manipulate() {
      //compile error
//      obj.f();
    }
  }

  static class Manipulator2<T extends HasF> {

    private T obj;

    public Manipulator2(T x) {
      this.obj = x;
    }

    public void manipulate() {
      obj.f();
    }

  }

  static class Manipulator3 {

    private HasF obj;

    public Manipulator3(HasF x) {
      this.obj = x;
    }

    public void manipulate() {
      obj.f();
    }

  }

  public static void main(String[] args) {
    HasF hf = new HasF();
    Manipulator<HasF> manipulator = new Manipulator<>(hf);
    manipulator.manipulate();
  }
}
