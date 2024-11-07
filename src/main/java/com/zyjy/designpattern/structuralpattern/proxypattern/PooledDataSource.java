package com.zyjy.designpattern.structuralpattern.proxypattern;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class PooledDataSource implements DataSource {

  private String url;
  private String username;
  private String password;

  //空闲队列
  private Queue<PooledConnectionProxy> pooledConnectionProxies = new ArrayBlockingQueue<>(100);
  ;

  @Override
  public Connection getConnection() throws SQLException {
    //从连接池中获取连接
    PooledConnectionProxy connectionProxy = pooledConnectionProxies.poll();
    if (connectionProxy == null) {
      //创建新的连接
      connectionProxy = openNewConnection();
    } else {
      System.out.println("从连接池中获取连接....");
    }
    return connectionProxy;
  }

  /*
  创建连接
   */
  private PooledConnectionProxy openNewConnection() {
    try {
      Connection connection = DriverManager.getConnection("", "", "");
      return new PooledConnectionProxy(connection, pooledConnectionProxies);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }

  @Override
  public Connection getConnection(String username, String password) throws SQLException {
    return null;
  }

  @Override
  public <T> T unwrap(Class<T> iface) throws SQLException {
    return null;
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    return false;
  }

  @Override
  public PrintWriter getLogWriter() throws SQLException {
    return null;
  }

  @Override
  public void setLogWriter(PrintWriter out) throws SQLException {

  }

  @Override
  public void setLoginTimeout(int seconds) throws SQLException {

  }

  @Override
  public int getLoginTimeout() throws SQLException {
    return 0;
  }

  @Override
  public Logger getParentLogger() throws SQLFeatureNotSupportedException {
    return null;
  }
}
