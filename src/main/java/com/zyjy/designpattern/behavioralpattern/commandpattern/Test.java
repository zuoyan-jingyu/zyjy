package com.zyjy.designpattern.behavioralpattern.commandpattern;

public class Test {

  public static void main(String[] args) {
    /*
    命令模式：将请求封装为一个命令类。换句话说就是有一个类专门是具体的命令/请求
    命令类持有一个真正执行命令的对象。创建命令时需要传入真正执行的对象
     */

    Waiter waiter = new Waiter();
    Kitchen kitchen = new Kitchen();

    //创建命令
    MakePizzaCommand makePizzaCommand = new MakePizzaCommand(kitchen);

    //由服务员调用命令 交与厨房执行
    waiter.takeCommands(makePizzaCommand);
    waiter.submitCommand();
    waiter.undoCommand(makePizzaCommand);
  }
}
