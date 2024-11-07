package com.zyjy.designpattern.structuralpattern.facedepattern;

public class Tets {

  public static void main(String[] args) {
    /*
    外观模式：提供统一的接口便于用户使用，来实现一些功能
    简单来说就是 统一的接口中包含其它功能的接口
     */

    //旧的调用逻辑
    new ChineseTestPaper().doTestPaper("小明");
    new EnglishTestPaper().doTestPaper("小明");
    new MathTestPaper().doTestPaper("小明");

    System.out.println("----------------------------");

    //使用外观模式后的调用逻辑
    new TestPaper(new ChineseTestPaper(),new EnglishTestPaper(),new MathTestPaper()).doTestPaper("小明");
  }
}
