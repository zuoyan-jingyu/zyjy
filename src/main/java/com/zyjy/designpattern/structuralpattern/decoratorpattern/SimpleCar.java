package com.zyjy.designpattern.structuralpattern.decoratorpattern;

import com.zyjy.designpattern.structuralpattern.decoratorpattern.interfaces.ICar;

public class SimpleCar implements ICar {

  @Override
  public String getDescribe() {
    return "这是简单的一辆车";
  }
}
