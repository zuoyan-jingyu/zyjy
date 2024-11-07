package com.zyjy.designpattern.structuralpattern.decoratorpattern;

import com.zyjy.designpattern.structuralpattern.decoratorpattern.interfaces.ICar;

/*
抽象的装饰器类
 */
public abstract class CarDecorator implements ICar {
  private ICar car;

  public CarDecorator(ICar car){
    this.car = car;
  }

  @Override
  public String getDescribe() {
    return car.getDescribe();
  }
}
