package com.huigod.spring.com.huigod.thinkjava.example15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author TengH
 * @Date 2018/8/6 14:11
 * @Description
 **/
public class ArrayMaker<T> {

  private Class<T> kind;

  public ArrayMaker(Class<T> kind) {
    this.kind = kind;
  }

  T[] create(int size) {
    return (T[]) Array.newInstance(kind, size);
  }

  public static void main(String[] args) {
    ArrayMaker<String> stringArrayMaker = new ArrayMaker<>(String.class);
    String[] stringArray = stringArrayMaker.create(7);
    System.out.println(Arrays.toString(stringArray));
  }
}
