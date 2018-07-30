package com.huigod.spring.com.huigod.thinkjava.example13;

/**
 * @Author TengH
 * @Date 2018/7/30 17:42
 * @Description
 **/
public class SweetShop {

  public static void main(String[] args) {
    System.out.println("inside main");
    new Candy();
    System.out.println("After creating Candy");
    try {
      Class.forName("com.huigod.spring.com.huigod.thinkjava.example13.Gum");
    } catch (ClassNotFoundException e) {
      System.out.println("Could't find Gum");
    }
    System.out.println("After Class.forName(\"Gum\")");
    new Cookie();
    System.out.println("After creating Cookie");
  }
}
