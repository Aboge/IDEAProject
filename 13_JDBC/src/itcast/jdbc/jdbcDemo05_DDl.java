package itcast.jdbc;

import java.sql.*;

public class jdbcDemo05_DDl {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取链接对象connection
            connection = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123456");
            //3。获取执行sql对象
            statement = connection.createStatement();

            //4.定义sql
            String sql = "create table  student(id int, name varchar(30))";

            //5.执行sql语句
            int i = statement.executeUpdate(sql);

            //6.处理结果
            System.out.println(i);
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
