package com.zyjy.designpattern.structuralpattern.adapterpattern;

import java.util.concurrent.Callable;

public class A implements Callable {

  @Override
  public Object call() throws Exception {
    System.out.println("A:1111");
    return null;
  }
}
