package com.zyjy.designpattern.structuralpattern.bridgepattern;


import com.zyjy.designpattern.structuralpattern.bridgepattern.interfaces.ICar;
import com.zyjy.designpattern.structuralpattern.bridgepattern.interfaces.IColor;
import com.zyjy.designpattern.structuralpattern.bridgepattern.interfaces.IModel;

/*
具体的汽车，其中每一个属性 对应一个维度(颜色、型号)
 */
public class ChangHongCar implements ICar {

  //汽车颜色
  IColor color;
  //汽车型号
  IModel model;

  public ChangHongCar(IColor color, IModel model) {
    this.color = color;
    this.model = model;
  }

  @Override
  public void display() {
    color.showColor();
    model.showModel();
  }
}
