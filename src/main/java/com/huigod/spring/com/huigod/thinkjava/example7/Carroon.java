package com.huigod.spring.com.huigod.thinkjava.example7;

public class Carroon extends Drawing {

  Carroon() {
    System.out.println("Cartoon constructor");
  }

  public static void main(String[] args) {
    Carroon x = new Carroon();
  }

}

class Art {

  Art() {
    System.out.println("Art constructor");
  }

}

class Drawing extends Art {

  Drawing() {
    System.out.println("Drawing constructor");
  }

}
