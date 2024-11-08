package com.zyjy.designpattern.behavioralpattern.commandpattern;

public class MakePizzaCommand implements Command {

  public Kitchen kitchen;

  public MakePizzaCommand(Kitchen kitchen) {
    this.kitchen = kitchen;
  }

  @Override
  public void execute() {
    kitchen.makePizza();
  }

  @Override
  public void undo() {
    System.out.println("客人取消了制作披萨的订单....");
  }
}
