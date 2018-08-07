package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 17:14
 * @Description
 **/
public class CovariantArrays {

  static class Fruit {

  }

  static class Apple extends Fruit {

  }

  static class Jonathan extends Apple {

  }

  static class Orange extends Fruit {

  }

  public static void main(String[] args) {
    Fruit[] fruits = new Apple[10];
    fruits[0] = new Apple();
    fruits[1] = new Jonathan();
    try {
      fruits[0] = new Fruit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
      fruits[0] = new Orange();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
