package com.huigod.spring;


import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

  private Enhancer enhancer = new Enhancer();

  public Object getProxy(Class<?> clazz) {
    enhancer.setSuperclass(clazz);
    enhancer.setCallback(this);
    return enhancer.create();
  }

  public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy)
      throws Throwable {
    System.out.println(o.getClass().getName() + "." + method.getName());

    Object result = methodProxy.invokeSuper(o, args);

    System.out.println("执行结束");

    return result;
  }

  public static void main(String[] args) {
    CglibProxy cglibProxy = new CglibProxy();
    Person person = (Person) cglibProxy.getProxy(Person.class);
    System.out.println(person.getClass().getName());
    System.out.println(person.getClass().getSuperclass().getName());
    person.sayHi();
  }
}
