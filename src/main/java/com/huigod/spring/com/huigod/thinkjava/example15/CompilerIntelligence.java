package com.huigod.spring.com.huigod.thinkjava.example15;

import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Apple;
import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Fruit;
import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {

  public static void main(String[] args) {
    List<? extends Fruit> flist = Arrays.asList(new Apple());
    Apple a = (Apple) flist.get(0);
    flist.contains(new Apple());
    flist.indexOf(new Apple());
  }
}
