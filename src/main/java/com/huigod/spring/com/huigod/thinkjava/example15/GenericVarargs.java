package com.huigod.spring.com.huigod.thinkjava.example15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author TengH
 * @Date 2018/8/3 14:56
 * @Description
 **/
public class GenericVarargs {

  public static <T> List<T> makeList(T... args) {
    List<T> result = new ArrayList<>();
    for (T item : args) {
      result.add(item);
    }
    return result;

  }

  public static void main(String[] args) {
    List<String> ls = makeList("A");
    System.out.println(ls);
    ls = makeList("A", "B", "C");
    System.out.println(ls);
    ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
}
