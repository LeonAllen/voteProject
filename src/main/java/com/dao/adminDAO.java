package main.java.com.dao;

import java.sql.*;

/**
 * Created by weicheng on 2017/4/23.
 */


public class adminDAO  {
    String DRIVER = "com.mysql.jdbc.Driver";//数据库驱动
    String URL = "jdbc:mysql://localhost:3306/vote";//**指的是数据库名称
    String USERNAME = "root";//数据库用户名
    String PWD = "123456";//数据库密码

    private Connection connection;
    private PreparedStatement ps;
    protected ResultSet rs;

    public void getConnection(){
        try {
            Class.forName(DRIVER);
            // 2在网络中查找数据库，创建连接对象
            connection = DriverManager.getConnection(
                    URL, USERNAME,PWD);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //return connection;
    }

    public void closeAll(){
        try {
            // 释放资源
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
     public boolean getadmin(String username ,String password) throws SQLException {
         String sql = "select * from admin where username = ? and password = ?";
         PreparedStatement ps;
         getConnection();
         ps = (PreparedStatement)connection.prepareStatement(sql);
         ps.setString(1,username);
         ps.setString(2,password);
         ResultSet rs = ps.executeQuery();
         if (rs.next()){
             return true;
         }
         else
             return false;

     }
}
