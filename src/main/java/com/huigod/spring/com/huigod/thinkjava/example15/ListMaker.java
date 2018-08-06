package com.huigod.spring.com.huigod.thinkjava.example15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author TengH
 * @Date 2018/8/6 15:24
 * @Description
 **/
public class ListMaker<T> {

  List<T> create() {
    return new ArrayList<>();
  }

  public static void main(String[] args) {
    ListMaker<String> stringListMaker = new ListMaker<>();
    List<String> stringList = stringListMaker.create();
  }
}
