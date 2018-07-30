package com.huigod.spring.com.huigod.thinkjava.example14;

public class GenericClassReferences {

  public static void main(String[] args) {
    Class intClass = int.class;
    Class<Integer> genericIntClass = int.class;
    genericIntClass = Integer.class;
    intClass = double.class;
//    Illegal
//    genericIntClass = double.class;
  }

}
