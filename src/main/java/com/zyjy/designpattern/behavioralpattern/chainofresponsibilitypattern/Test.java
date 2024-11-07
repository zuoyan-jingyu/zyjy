package com.zyjy.designpattern.behavioralpattern.chainofresponsibilitypattern;

public class Test {

  public static void main(String[] args) {
    /*
    责任链模式：
    最形象的例子是报销审批，需要一级一级地往上申请，当前层处理的了 就进行审批，当前层 处理不了则交由上级审批
     */


    //注意添加处理器的顺序，组长需要在老板的前面
    //创建处理器
    ProcessorChain processorChain = new ProcessorChain();
    processorChain.addProcessor(new GroupLeaderProcessor());
    processorChain.addProcessor(new BossProcessor());

    //创建请求
    Request requestOfXiaoMing = new Request("小明", 8888);
    Request requestOfXiaoHong = new Request("小红", 88);

    //处理请求
    processorChain.process(requestOfXiaoMing);
    processorChain.process(requestOfXiaoHong);
  }
}
