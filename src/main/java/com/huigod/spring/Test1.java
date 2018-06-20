package com.huigod.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test1 {

  public static void main(String[] args) {

    ClassPathResource classPathResource = new ClassPathResource("beans.xml");
    DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
    xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
    Person person = (Person) defaultListableBeanFactory.getBean("person");
    System.out.println(person.sayHi());
    Person person2 = (Person) defaultListableBeanFactory.getBean("person2");
    System.out.println(person2.sayHi());
  }

}
