package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 10:04
 * @Description
 **/
public class InstantiateGenericType {

  static class ClassAsFactory<T> {

    T x;

    public ClassAsFactory(Class<T> kind) {
      try {
        x = kind.newInstance();
      } catch (Exception e) {
        throw new RuntimeException();
      }
    }

    public T getX() {
      return x;
    }
  }

  static class Employee {

  }

  public static void main(String[] args) {
    ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
    System.out.println("ClassAsFactory<Employee> succeeded");
    System.out.println(fe.getX().getClass().getName());
    try {
      ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
    } catch (Exception e) {
      System.out.println("ClassAsFactory<Integer> failed");
    }
  }
}
