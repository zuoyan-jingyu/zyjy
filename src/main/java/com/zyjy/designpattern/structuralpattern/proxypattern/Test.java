package com.zyjy.designpattern.structuralpattern.proxypattern;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

  public static void main(String[] args) throws SQLException {
    /*
    代理模式：
    实现这个类，并且有一个这个类的属性，可以重写方法来修改代码。
    注：真正使用的类其实是代理类
     */
    /*
    这个案例我感觉不是很恰当，谈不上对原来的类进行了代理，但是某种角度可以将抽象类理解为原来的类
     */

    //懒加载
    LazyDataSource lazyDataSource = new LazyDataSource("", "", "");
    Connection connection = lazyDataSource.getConnection();
    //这里会调用getRealConnection，如果没有则通过supplier.get()来建立连接
    PreparedStatement preparedStatement = connection.prepareStatement("selecr * from hdtp.dept");

    //连接池
    PooledDataSource pooledDataSource = new PooledDataSource();
    Connection connection1 = pooledDataSource.getConnection();
    Statement statement = connection1.createStatement();
  }
}
