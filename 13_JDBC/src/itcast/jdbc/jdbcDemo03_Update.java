package itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* account 表修改记录
* */
public class jdbcDemo03_Update {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取链接对象
            connection = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123456");

            //3.定义sql
            String sql = "update account set balance = 1500 where id  = 3";

            //4.获取执行sql对象
            statement = connection.createStatement();

            //5。执行sql
            int i = statement.executeUpdate(sql);

            //6.处理结果
            System.out.println(i);
            if (i > 0){
                System.out.println("执行成功！");
            }else {
                System.out.println("执行失败！");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
