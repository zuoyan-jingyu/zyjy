package com.zyjy.designpattern.behavioralpattern.interpreterpattern;

public class Test {

  public static void main(String[] args) {
    /*
    解释器模式：解释一个语法，像SQL解析、表达式解析等
    有终结表达式(像叶子节点)、非终结表达式(像非叶子节点)、上下文(例如优先级设置)
    例如在SQL解析中，SELECT、FROM这些就是非终结表达式，需要带上值操作；而列名等就是终结表达式
     */

    //创建表达式：2+3*4
    AddExpression addExpression = new AddExpression(new NumberExpress(2),
        new MultiExpression(new NumberExpress(3), new NumberExpress(4)));
    System.out.println(addExpression.interpret());
  }
}
