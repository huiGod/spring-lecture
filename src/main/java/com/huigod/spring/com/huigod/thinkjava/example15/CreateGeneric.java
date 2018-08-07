package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 10:57
 * @Description
 **/
public class CreateGeneric {

  abstract class GenericWithCreate<T> {

    final T element;

    GenericWithCreate() {
      element = create();
    }

    abstract T create();

  }

  class X {

  }

  class Creator extends GenericWithCreate<X> {

    @Override
    X create() {
      return new X();
    }

    void f() {
      System.out.println(element.getClass().getSimpleName());
    }
  }

  Creator getCreator() {
    return new Creator();
  }

  public static void main(String[] args) {
    CreateGeneric createGeneric = new CreateGeneric();
    createGeneric.getCreator().f();

  }

}
