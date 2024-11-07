package com.zyjy.designpattern.behavioralpattern.chainofresponsibilitypattern;

/*
组长类(处理器)
 */
public class GroupLeaderProcessor implements Processor {

  @Override
  public Boolean process(Request request) {
    //只要不是小明，并且金额在1000元以下，就同意报销
    if (request.getName().equals("小明")) {
      System.out.println("组长拒绝了" + request.getName() + "的报销申请");
      return false;
    }

    if (request.getMoney() > 1000) {
      System.out.println("组长请求老板处理" + request.getName() + "的报销申请....");
      return null;
    }else{
      System.out.println("组长同意了" + request.getName() + "的报销申请");
      return false;
    }
  }
}
