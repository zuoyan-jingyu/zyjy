package com.zyjy.designpattern.structuralpattern.adapterpattern;

public class B implements Runnable {

  private A a;

  public B(A a) {
    this.a = a;
  }

  @Override
  public void run() {
    try {
      a.call();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
