package com.huigod.spring.com.huigod.thinkjava.example11;

import java.util.ArrayList;

/**
 * @Author TengH
 * @Date 2018/7/26 17:02
 * @Description
 **/
public class ApplesAndOrangesWithoutGenerics {

  public static void main(String[] args) {
    ArrayList apples = new ArrayList();
    apples.add(new Apple());
    apples.add(new Orange());
    for (int i = 0; i < apples.size(); i++) {
      ((Apple) apples.get(i)).id();
    }
  }
}
