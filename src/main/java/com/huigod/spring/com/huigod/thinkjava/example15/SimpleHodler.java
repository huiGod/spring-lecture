package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/6 15:40
 * @Description
 **/
public class SimpleHodler {

  private Object obj;

  public void set(Object obj) {
    this.obj = obj;
  }

  public Object get() {
    return obj;
  }

  public static void main(String[] args) {
    SimpleHodler hodler = new SimpleHodler();
    hodler.set("Item");
    String s = (String) hodler.get();
  }

}
