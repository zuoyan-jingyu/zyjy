package com.zyjy.designpattern.structuralpattern.compositepattern;

import java.util.List;

public interface Node {
  //添加节点
  Node add(Node node);
  //子节点
  List<Node> children();
  //返回值，包括子节点的
  String toXml();
}
