package com.zyjy.designpattern.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextNode implements Node {

  private String text;

  public TextNode(String text) {
    this.text = text;
  }

  @Override
  public Node add(Node node) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<Node> children() {
    // 注：java9之后才可以使用List.of()，来创建一个不可变对象。当变化这个对象时，会抛出UnsupportedOperationException()异常
    // return List.of();
    return Collections.unmodifiableList(new ArrayList<Node>());
  }

  @Override
  public String toXml() {
    return text;
  }
}
