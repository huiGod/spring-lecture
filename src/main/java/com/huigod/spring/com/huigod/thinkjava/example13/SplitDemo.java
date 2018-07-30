package com.huigod.spring.com.huigod.thinkjava.example13;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author TengH
 * @Date 2018/7/30 15:00
 * @Description
 **/
public class SplitDemo {

  public static void main(String[] args) {
    String input = "This!!unusual use!!of exclamation!!points";
    System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
    System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
  }
}
