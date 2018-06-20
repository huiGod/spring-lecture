package com.huigod.spring;

import lombok.Data;

@Data
public class Person {

  private String name;

  public String sayHi() {
    return this.name;
  }
}
