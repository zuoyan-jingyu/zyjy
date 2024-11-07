package com.zyjy.designpattern.behavioralpattern.chainofresponsibilitypattern;

import java.util.ArrayList;
import java.util.List;

/*
处理器链：将处理器通过集合关联起来，建立关系
 */
public class ProcessorChain {

  List<Processor> processors = new ArrayList<>();

  void addProcessor(Processor processor) {
    processors.add(processor);
  }

  public Boolean process(Request request) {
    for (Processor processor : processors) {
      Boolean processResult = processor.process(request);
      if (processResult != null) {
        return processResult;
      }
    }
    throw new RuntimeException("不能处理请求....");
  }
}
