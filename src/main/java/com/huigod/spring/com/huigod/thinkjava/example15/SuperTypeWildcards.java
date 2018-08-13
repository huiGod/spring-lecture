package com.huigod.spring.com.huigod.thinkjava.example15;

import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Apple;
import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Jonathan;
import java.util.List;

public class SuperTypeWildcards {

  static void writeTo(List<? super Apple> apples) {
    apples.add(new Apple());
    apples.add(new Jonathan());
//    compile error
//    apples.add(new Fruit());
  }

}
