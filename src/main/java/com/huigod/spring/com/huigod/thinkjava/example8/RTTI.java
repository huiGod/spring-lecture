package com.huigod.spring.com.huigod.thinkjava.example8;

public class RTTI {

  public static void main(String[] args) {
    Userful[] x = {new Userful(), new MoreUserful()};
    x[0].f();
    x[1].g();
//    编译时报错
//    x[1].u();
    ((MoreUserful)x[1]).u();
//    运行时报错
    ((MoreUserful)x[0]).u();
  }
}

class Userful {

  public void f() {

  }

  public void g() {

  }

}

class MoreUserful extends Userful {

  public void f() {

  }

  public void g() {
  }

  public void u() {
  }

  public void v() {
  }

  public void w() {
  }

}
