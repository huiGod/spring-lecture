package com.huigod.spring.com.huigod.thinkjava.example15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author TengH
 * @Date 2018/8/3 15:46
 * @Description
 **/
public class LostInformation {

  static class Frob {

  }

  static class Fnorkle {

  }

  static class Quark<Q> {

  }

  static class Particle<POSITION, MOMENTUM> {

  }

  public static void main(String[] args) {
    List<Frob> list = new ArrayList<>();
    Map<Frob, Fnorkle> map = new HashMap<>();
    Quark<Fnorkle> quark = new Quark<>();
    Particle<Long, Double> p = new Particle<>();
    System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
    System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
  }
}
