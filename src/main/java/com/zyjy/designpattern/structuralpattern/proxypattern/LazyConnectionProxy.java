package com.zyjy.designpattern.structuralpattern.proxypattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Supplier;

public class LazyConnectionProxy extends AbstractConnectionProxy {

  //函数示接口，返回Connection对象。可以通过调用get()来进行延迟加载
  private Supplier<Connection> supplier;
  private Connection target;

  public LazyConnectionProxy(Supplier<Connection> supplier) {
    this.supplier = supplier;
  }

  @Override
  protected Connection getRealConnection() {
    if (target == null) {
      target = supplier.get();
    }
    return target;
  }

  @Override
  public void close() throws SQLException {
    if (target != null) {
      System.out.println("关闭连接:" + target);
      super.close();
    }
  }
}
