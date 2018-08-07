package com.huigod.spring.com.huigod.thinkjava.example15;

import java.lang.reflect.Array;

/**
 * @Author TengH
 * @Date 2018/8/7 14:23
 * @Description
 **/
public class GenericArrayWithTypeToken<T> {

  private T[] array;

  public GenericArrayWithTypeToken(Class<T> type, int size) {
    array = (T[]) Array.newInstance(type, size);
  }

  public void put(int index, T item) {
    array[index] = item;
  }

  public T get(int index) {
    return array[index];
  }

  public T[] rep() {
    return array;
  }

  public static void main(String[] args) {
    GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<>(Integer.class, 10);
    gai.put(1, 1);
    Integer value = gai.get(1);
    //works well
    Integer[] ia = gai.rep();
  }

}
