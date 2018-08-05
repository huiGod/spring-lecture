package com.huigod.spring.com.huigod.thinkjava.example15;

import com.huigod.spring.com.huigod.thinkjava.example15.Manipulation.HasF;

public class ReturnGenericType<T extends HasF> {

  static class HasFExtend extends HasF{

  }


  private T obj;

  public ReturnGenericType(T x) {
    obj = x;
  }

  public T get() {
    return obj;
  }

  public static void main(String[] args) {
    ReturnGenericType<HasFExtend> returnGenericType = new ReturnGenericType(new HasFExtend());

    System.out.println(returnGenericType.get().getClass().getName());
    System.out.println(returnGenericType.getClass().getTypeParameters());
  }
}
