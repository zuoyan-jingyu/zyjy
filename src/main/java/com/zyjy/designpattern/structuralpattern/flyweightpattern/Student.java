package com.zyjy.designpattern.structuralpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class Student {

  //通过缓存 实现享元模式，如果存在则直接返回缓存中的对象
  private static final Map<String, Student> cache = new HashMap<>();

  public static Student create(int id, String name) {
    String identityCard = id + "_" + name;
    if (cache.containsKey(identityCard)) {
      System.out.println("对象已存在，返回缓存中的对象...");
      return cache.get(identityCard);
    } else {
      //创建对象，并将对象添加到缓存中
      Student student = new Student(id, name);
      System.out.println("创建新的对象,并加入到缓存中.....");
      cache.put(identityCard, student);
      return student;
    }
  }


  private final int id;
  private final String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
