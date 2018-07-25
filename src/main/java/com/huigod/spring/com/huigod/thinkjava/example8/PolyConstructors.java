package com.huigod.spring.com.huigod.thinkjava.example8;

public class PolyConstructors {

  public static void main(String[] args) {
    new RoundGlyph(5);
  }
}

class Glyph {

  void draw() {
    System.out.println("Glyph.draw()");
  }

  Glyph() {
    System.out.println("Glyph() before draw()");
    draw();
    System.out.println("Glyph() after draw()");
  }
}

class RoundGlyph extends Glyph {

  private int radius = 1;

  RoundGlyph(int radius) {
    this.radius = radius;
    System.out.println("RoundGlyph.RoundGlyph(),radius= " + this.radius);
  }

  @Override
  void draw() {
    System.out.println("RoundGlyph.draw(),radius= " + this.radius);
  }
}
