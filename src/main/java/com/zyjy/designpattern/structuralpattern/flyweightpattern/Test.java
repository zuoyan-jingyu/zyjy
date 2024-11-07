package com.zyjy.designpattern.structuralpattern.flyweightpattern;

public class Test {

  public static void main(String[] args) {
    /*
    享元模式：当对象内部的属性不需要变化时(final修饰)，那么没必要每次都创建对象。可以利用缓存，当对象已经存在时，直接从缓存中返回已经存在的对象，减少内存
    通过静态方法来实现这个逻辑，不需要直接通过new 构造器
     */
    Student student1 = Student.create(1, "小明");
    Student student2 = Student.create(1, "小明");
  }
}
