package com.zyjy.designpattern.behavioralpattern.interpreterpattern;

/*
非终结表达式(像非叶子节点)
 */
public class AddExpression implements Expression {

  public Expression leftExpression;
  public Expression rightExpression;

  public AddExpression(
      Expression leftExpression,
      Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public double interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }
}
