package com.zyjy.designpattern.structuralpattern.proxypattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Queue;

public class PooledConnectionProxy extends AbstractConnectionProxy {

  private Connection target;
  //空闲队列
  private Queue<PooledConnectionProxy> pooledConnectionProxies;

  public PooledConnectionProxy(Connection target,
      Queue<PooledConnectionProxy> pooledConnectionProxies) {
    this.target = target;
    this.pooledConnectionProxies = pooledConnectionProxies;
  }

  @Override
  protected Connection getRealConnection() {
    return target;
  }

  @Override
  public void close() throws SQLException {
    System.out.println("把连接放回到连接池....");
    //并不是真正的关闭连接，而是将连接添加到连接池中
    pooledConnectionProxies.offer(this);
  }
}
