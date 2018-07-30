package com.huigod.spring.com.huigod.thinkjava.example13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author TengH
 * @Date 2018/7/30 10:58
 * @Description
 **/
public class Finding {
  public static void main(String[] args) {
    Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
    while (m.find()) {
      System.out.println(m.group() + " ");
    }
    System.out.println();
    int i = 0;
    while (m.find(i)) {
      System.out.println(m.group() + " ");
      i++;
    }
  }

}
