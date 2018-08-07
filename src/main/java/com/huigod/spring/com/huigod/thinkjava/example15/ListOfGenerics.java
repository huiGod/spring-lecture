package com.huigod.spring.com.huigod.thinkjava.example15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author TengH
 * @Date 2018/8/7 13:38
 * @Description
 **/
public class ListOfGenerics<T> {

  private List<T> array = new ArrayList<>();

  public void add(T item) {
    array.add(item);
  }

  public T get(int index) {
    return array.get(index);
  }

}
