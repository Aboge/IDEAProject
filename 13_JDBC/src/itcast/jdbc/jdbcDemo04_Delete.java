package itcast.jdbc;

import java.sql.*;

public class jdbcDemo04_Delete {
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
            String sql = "delete from account where id = 3";

            //5.执行sql语句
            int i = statement.executeUpdate(sql);

            //6.处理结果
            if(i > 0){
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败！");
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
