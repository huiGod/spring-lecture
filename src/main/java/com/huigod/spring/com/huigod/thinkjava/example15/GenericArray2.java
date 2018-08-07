package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 14:09
 * @Description
 **/
public class GenericArray2<T> {

  private Object[] array;

  public GenericArray2(int size) {
    array = new Object[size];
  }

  public void put(int index, T item) {
    array[index] = item;
  }

  public T get(int index) {
    return (T) array[index];
  }

  public T[] rep() {
    return (T[]) array;
  }

  public static void main(String[] args) {
    GenericArray2<Integer> gai = new GenericArray2<>(10);
    for (int i = 0; i < 10; i++) {
      gai.put(i, 1);
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(gai.get(i) + " ");
    }
    System.out.println();
    try {
      //compile-time error ClassCastException
      Integer[] ia = gai.rep();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
