package com.huigod.spring.com.huigod.thinkjava.example15;

import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Apple;
import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Fruit;
import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Orange;

public class Holder<T> {

  private T value;

  public Holder() {

  }

  public Holder(T val) {
    value = val;
  }

  public void set(T val) {
    value = val;
  }

  public T get() {
    return value;
  }

  public boolean equals(Object obj) {
    return value.equals(obj);
  }

  public static void main(String[] args) {
    Holder<Apple> Apple = new Holder<>(new Apple());
    Apple d = Apple.get();
    Apple.set(d);
//    Cannot upcast
//    Holder<Fruit> Fruit = Apple;
    Holder<? extends Fruit> fruit = Apple;
    Fruit p = fruit.get();
    d = (Apple) fruit.get();
    try {
      Orange o = (Orange) fruit.get();
    } catch (Exception e) {
      e.printStackTrace();
    }
//    Cannot call set()
//    fruit.set(new Apple());
//    Cannot call set()
//    fruit.set(new Fruit());
    System.out.println(fruit.equals(d));
  }
}
