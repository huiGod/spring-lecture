package com.huigod.spring.com.huigod.thinkjava.example15;

class BasicHolder<T> {

  T element;

  public T getElement() {
    return element;
  }

  public void setElement(T element) {
    this.element = element;
  }

  void f() {
    System.out.println(element.getClass().getSimpleName());
  }
}

class Subtype extends BasicHolder<Subtype> {

}

public class CRGWithBasicHolder {

  public static void main(String[] args) {
    Subtype st1 = new Subtype();
    Subtype st2 = new Subtype();
    st1.setElement(st2);
    Subtype st3 = st1.getElement();
    st1.f();
  }
}
