package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/3 10:34
 * @Description
 **/
public class TwoTuple<A, B> {

  public final A first;
  public final B second;

  public TwoTuple(A a, B b) {
    first = a;
    second = b;
  }

  @Override
  public String toString() {
    return "(" + first + "," + second + ")";
  }

  static class TupleTest {
    static TwoTuple<String,Integer> f() {
      return new TwoTuple<>("hi", 47);
    }

  }

  public static void main(String[] args) {
    TwoTuple<String, Integer> ttsi = TupleTest.f();
    System.out.println(ttsi);
  }
}
