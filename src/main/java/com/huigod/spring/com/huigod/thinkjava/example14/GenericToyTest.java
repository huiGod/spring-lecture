package com.huigod.spring.com.huigod.thinkjava.example14;

/**
 * @Author TengH
 * @Date 2018/7/31 11:37
 * @Description
 **/
public class GenericToyTest {

  class Toy {

  }

  class FancyToy extends Toy {

  }


  public static void main(String[] args) throws Exception{
    Class<FancyToy> ftClass = FancyToy.class;
    FancyToy fancyToy = ftClass.newInstance();
    Class<? super FancyToy> up = ftClass.getSuperclass();
//    compile error
//    Class<Toy> up2 = ftClass.getSuperclass();
    Object object = up.newInstance();
  }
}
