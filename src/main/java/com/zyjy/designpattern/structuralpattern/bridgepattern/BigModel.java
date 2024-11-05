package com.zyjy.designpattern.structuralpattern.bridgepattern;

import com.zyjy.designpattern.structuralpattern.bridgepattern.interfaces.IModel;

/*
型号的实现类 -- 特大型号
 */
public class BigModel implements IModel {

  @Override
  public void showModel() {
    System.out.println("特大型号");
  }
}
