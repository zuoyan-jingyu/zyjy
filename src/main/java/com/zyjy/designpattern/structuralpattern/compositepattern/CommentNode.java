package com.zyjy.designpattern.structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommentNode implements Node {

  private String text;

  public CommentNode(String text) {
    this.text = text;
  }

  @Override
  public Node add(Node node) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<Node> children() {
    return Collections.unmodifiableList(new ArrayList<Node>());
  }

  @Override
  public String toXml() {
    return "<!-- " + text + " -->";
  }
}
