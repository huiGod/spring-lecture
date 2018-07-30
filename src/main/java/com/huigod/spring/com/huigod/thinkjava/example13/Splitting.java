package com.huigod.spring.com.huigod.thinkjava.example13;

import java.util.Arrays;

/**
 * @Author TengH
 * @Date 2018/7/27 16:58
 * @Description
 **/
public class Splitting {

  public static String knights = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forrest... with... a herring";

  public static void split(String regex) {
    System.out.println(Arrays.toString(knights.split(regex)));
  }

  public static void main(String[] args) {
    split(" ");
    //非字符
    split("\\W+");
    //n开头的非字符
    split("n\\W+");
  }
}
