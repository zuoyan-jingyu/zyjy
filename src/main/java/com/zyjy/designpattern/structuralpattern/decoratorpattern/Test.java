package com.zyjy.designpattern.structuralpattern.decoratorpattern;

public class Test {

  public static void main(String[] args) {
    //装饰器模式：主要作用 是添加额外的功能
    //装饰器抽象类 既要实现实体类接口，也要持有实体类接口的属性。通过构造方法为属性赋值
    //装饰器具体类：需要重写与 实体类相同的方法，在调用原来方法的同时，也添加新增功能的代码
    SimpleCar simpleCar = new SimpleCar();
    System.out.println(simpleCar.getDescribe());

    FlowerCarDecorator flowerCarDecorator = new FlowerCarDecorator(simpleCar);
    System.out.println(flowerCarDecorator.getDescribe());
  }
}
