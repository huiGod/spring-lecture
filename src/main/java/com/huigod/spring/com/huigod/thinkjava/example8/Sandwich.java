package com.huigod.spring.com.huigod.thinkjava.example8;

public class Sandwich extends PortableLunch {

  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();

  public Sandwich() {
    System.out.println("Sandwich()");
  }

  public static void main(String[] args) {
    new Sandwich();
  }
}

class Meal {

  Meal() {
    System.out.println("Meal()");
  }

}

class Bread {

  Bread() {
    System.out.println("Bread()");
  }

}

class Lettuce {

  Lettuce() {
    System.out.println("Lettuce()");
  }
}

class Cheese {

  Cheese() {
    System.out.println("Cheese()");
  }

}

class Lunch extends Meal {

  private String a = "hello";

  Lunch() {
    System.out.println("Lunch()");
  }

}

class PortableLunch extends Lunch {

  PortableLunch() {
    super();
    System.out.println("PortableLunch()");
  }

}
