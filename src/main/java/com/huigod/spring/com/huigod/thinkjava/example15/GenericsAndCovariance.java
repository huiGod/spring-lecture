package com.huigod.spring.com.huigod.thinkjava.example15;

import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Apple;
import com.huigod.spring.com.huigod.thinkjava.example15.CovariantArrays.Fruit;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author TengH
 * @Date 2018/8/8 15:26
 * @Description
 **/
public class GenericsAndCovariance {

  public static void main(String[] args) {
    List<? extends Fruit> fruits = new ArrayList<Apple>();
    //Compile error
//    fruits.add(new Apple());
    //Compile error
//    fruits.add(new Fruit());
    //Compile error
//    fruits.add(new Object());
    fruits.add(null);
    Fruit f = fruits.get(0);
  }
}
