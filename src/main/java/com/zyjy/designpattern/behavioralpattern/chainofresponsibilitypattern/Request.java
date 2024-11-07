package com.zyjy.designpattern.behavioralpattern.chainofresponsibilitypattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
请求类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

  String name;
  int money;
}
