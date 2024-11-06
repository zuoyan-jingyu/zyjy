package com.zyjy.designpattern.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ElementNode implements Node {

  private String text;
  private List<Node> childNodes = new ArrayList<>();

  public ElementNode(String text) {
    this.text = text;
  }

  @Override
  public Node add(Node node) {
    childNodes.add(node);
    return this;
  }

  @Override
  public List<Node> children() {
    return childNodes;
  }

  @Override
  public String toXml() {
    String start = "<" + text + ">\n";
    String end = "</" + text + ">";
    StringJoiner stringJoiner = new StringJoiner("", start, end);
    //待升级：实现缩进
    //通过整型变量index来实现缩进有些困难，因为先遍历的可能是叶子节点
    childNodes.forEach(node ->
        stringJoiner.add(" " + node.toXml() + "\n")
    );
    return stringJoiner.toString();
  }
}
