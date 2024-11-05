package com.zyjy.designpattern.structuralpattern.bridgepattern;

import com.zyjy.designpattern.structuralpattern.bridgepattern.interfaces.IColor;

/*
颜色的实现类 -- 红色
 */
public class Red implements IColor {

  @Override
  public void showColor() {
    System.out.println("红色");
  }
}
