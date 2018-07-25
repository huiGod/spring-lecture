package com.huigod.spring.com.huigod.thinkjava.example8;

public class Transmogrify {

  public static void main(String[] args) {
    Stage stage = new Stage();
    stage.performPlay();
    stage.change();
    stage.performPlay();
  }
}

class Actor {

  public void act() {

  }

}

class HappyActor extends Actor {

  @Override
  public void act() {
    System.out.println("HappyActory");
  }
}

class SadActor extends Actor {

  @Override
  public void act() {
    System.out.println("SadActor");
  }
}

class Stage {

  private Actor actor = new HappyActor();

  public void change() {
    actor = new SadActor();
  }

  public void performPlay() {
    actor.act();
  }

}