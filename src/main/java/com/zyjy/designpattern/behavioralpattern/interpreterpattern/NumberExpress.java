package com.zyjy.designpattern.behavioralpattern.interpreterpattern;

/*
终结表达式(像叶子节点)
 */
public class NumberExpress implements Expression {

  public int number;

  public NumberExpress(int number) {
    this.number = number;
  }

  @Override
  public double interpret() {
    return number;
  }
}
