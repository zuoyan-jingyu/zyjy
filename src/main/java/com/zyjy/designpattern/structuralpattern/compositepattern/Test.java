package com.zyjy.designpattern.structuralpattern.compositepattern;

public class Test {

  public static void main(String[] args) {
    /*
    组合模式：
    将对象组合成树形结构，无论是容器还是叶子节点 均实现同一接口/继承同一抽象类，便于统一管理
     */
    ElementNode root = new ElementNode("school");
    root.add(
        new ElementNode("classA")
        .add(new TextNode("xiaoming"))
        .add(new TextNode("xiaohong"))
    ).add(
        new ElementNode("classB")
            .add(new TextNode("xiaoming"))
            .add(new CommentNode("分割线"))
            .add(new TextNode("xiaohong"))
    );
    System.out.println(root.toXml());
  }
}
