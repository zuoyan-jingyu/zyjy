package com.zyjy.designpattern.structuralpattern.adapterpattern;

public class Test {

  public static void main(String[] args) {
    A a = new A();
    //Thread的参数 需要的是 实现Runnable接口的对象
    //这里的 B类 就是一个适配器，将 Callable接口 转换成需要的 Runnable接口
    //实现方式：创建一个满足要求的B类，并且B类中持有A类的引用，且调用了A类方法
    new Thread(new B(a)).start();
  }
}
