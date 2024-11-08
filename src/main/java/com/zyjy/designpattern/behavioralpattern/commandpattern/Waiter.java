package com.zyjy.designpattern.behavioralpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

  List<MakePizzaCommand> makePizzaCommands = new ArrayList<>();

  /*
  服务员接收订单
   */
  public void takeCommands(MakePizzaCommand makePizzaCommand) {
    makePizzaCommands.add(makePizzaCommand);
  }

  /*
  服务员将订单送到厨房
   */
  public void submitCommand() {
    makePizzaCommands.forEach(m -> m.execute());
  }

  public void undoCommand(MakePizzaCommand makePizzaCommand) {
    makePizzaCommand.undo();
  }
}
