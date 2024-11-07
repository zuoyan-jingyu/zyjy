package com.zyjy.designpattern.structuralpattern.decoratorpattern;

import com.zyjy.designpattern.structuralpattern.decoratorpattern.interfaces.ICar;

public class FlowerCarDecorator extends CarDecorator {

  public FlowerCarDecorator(
      ICar car) {
    super(car);
  }

  @Override
  public String getDescribe() {
    return super.getDescribe() + ";现在给车加上了花";
  }
}
