package com.zyjy.designpattern.behavioralpattern.chainofresponsibilitypattern;

/*
老板类(处理器)
 */
public class BossProcessor implements Processor {

  @Override
  public Boolean process(Request request) {
    //老板审批：只要低于10000，就同意报销，否则拒绝报销
    if (request.getMoney() < 10000) {
      System.out.println("老板同意了" + request.getName() + "的报销申请");
      return true;
    }
    System.out.println("老板拒绝了" + request.getName() + "的报销申请");
    return false;
  }
}
