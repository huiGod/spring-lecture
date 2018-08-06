package com.huigod.spring.com.huigod.thinkjava.example15;

import java.util.ArrayList;

/**
 * @Author TengH
 * @Date 2018/8/3 15:43
 * @Description
 **/
public class ErasedTypeEquivalence {

  public static void main(String[] args) {
    Class c1 = new ArrayList<String>().getClass();
    Class c2 = new ArrayList<Integer>().getClass();
    System.out.println(c1 == c2);
  }

}
