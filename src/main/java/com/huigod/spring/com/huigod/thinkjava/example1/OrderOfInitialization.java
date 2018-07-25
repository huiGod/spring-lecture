package com.huigod.spring.com.huigod.thinkjava.example1;

public class OrderOfInitialization {

  public static void main(String[] args) {
    Hourse h = new Hourse();
    h.f();
  }
}

class Window {

  Window(int marker) {
    System.out.println("Window(" + marker + ")");
  }
}

class Hourse {

  Window w1 = new Window(1);

  Hourse() {
    System.out.println("Hourse()");
    w3 = new Window(33);
  }

  Window w2 = new Window(2);

  void f() {
    System.out.println("f()");
  }

  Window w3 = new Window(3);
}
