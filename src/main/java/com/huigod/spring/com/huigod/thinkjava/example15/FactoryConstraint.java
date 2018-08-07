package com.huigod.spring.com.huigod.thinkjava.example15;

/**
 * @Author TengH
 * @Date 2018/8/7 10:24
 * @Description
 **/
public class FactoryConstraint {

  interface Factory<T> {

    T create();
  }

  static class Foo2<T> {

    private T x;

    public <F extends Factory<T>> Foo2(F factory) {
      x = factory.create();
    }
  }

  static class IntegerFactory implements Factory<Integer> {

    @Override
    public Integer create() {
      return new Integer(0);
    }
  }

  static class Widget {

    public static class Factory implements FactoryConstraint.Factory<Widget> {

      @Override
      public Widget create() {
        return new Widget();
      }
    }
  }

  public static void main(String[] args) {
    new Foo2<Integer>(new IntegerFactory());
    new Foo2<Widget>(new Widget.Factory());
  }
}
