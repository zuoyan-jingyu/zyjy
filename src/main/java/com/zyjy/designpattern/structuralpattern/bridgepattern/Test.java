package com.zyjy.designpattern.structuralpattern.bridgepattern;

public class Test {

  public static void main(String[] args) {
    //桥接模式：桥接指的是 IColor、IModel这样的接口，通过这个接口 将维度属性 和 汽车这个具体类 连接在一起
    /*
    桥接模式：将维度 变为属性 ，可以防止子类增长爆炸问题
    例如：
    ①当将 维度 通过 接口/抽象类 体现，然后作为 实体类属性 引入；
    这样当一个维度需要增加某个值值时(例如白色、小型汽车)，那么便只需新增一个维度的实现类即可；
    ②而如果直接单纯通过新增类来解决，假如有两个维度，那么需要新增1*(另一维度的个数)
     */

    Red red = new Red();
    BigModel bigModel = new BigModel();
    ChangHongCar changHongCar = new ChangHongCar(red, bigModel);

    changHongCar.display();
  }
}
