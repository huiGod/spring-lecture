package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 11:30
 * @Description
 **/
public class GenericArray<T> {

  private T[] array;

  public GenericArray(int size) {
    array = (T[]) new Object[size];
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
    GenericArray<Integer> gai = new GenericArray<>(10);
    //throw ClassCastException
//    Integer[] ia = gai.rep();
    Object[] oa = gai.rep();
  }
}
