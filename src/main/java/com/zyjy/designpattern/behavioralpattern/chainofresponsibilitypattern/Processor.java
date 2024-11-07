package com.zyjy.designpattern.behavioralpattern.chainofresponsibilitypattern;

public interface Processor {

  /*
  根据返回值来表示处理状态：
  TRUE：表示接收报销请求
  FALSE：表示拒绝报销请求
  NULL：表示交给上一级审批
   */
  Boolean process(Request request);
}
