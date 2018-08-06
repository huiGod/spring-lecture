package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/6 17:33
 * @Description
 **/
public class GenericHolder<T> {
  private T obj;

  public T getObj() {
    return obj;
  }

  public void setObj(T obj) {
    this.obj = obj;
  }

  public static void main(String[] args) {
    GenericHolder<String> holder = new GenericHolder<>();
    holder.setObj("Item");
    String s = holder.getObj();
  }
}
