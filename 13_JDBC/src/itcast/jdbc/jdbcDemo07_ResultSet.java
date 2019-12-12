package itcast.jdbc;

import java.sql.*;

public class jdbcDemo07_ResultSet {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取链接对象connection
            connection = DriverManager.getConnection("jdbc:mysql:///db1", "root", "123456");
            //3。获取执行sql对象
            statement = connection.createStatement();

            //4.定义sql
            String sql = "select * from account";

            //5.执行sql语句
            rs = statement.executeQuery(sql);

            //6.处理结果
            //6.1让游标向下移动一行

            /*if (rs.next()){ //先判断光标移动后是否还有数据存在，如果存在则继续
                int id = rs.getInt(1); //对象接收第一行第一列的值
                String name = rs.getString(2);
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "----" + balance);
            }*/
            /*//6.2游标继续下移
            rs.next();//从表头移动到数据行
            int id1 = rs.getInt(1); //对象接收第一行第一列的值
            String name1 = rs.getString(2);
            double balance1 = rs.getDouble(3);
            System.out.println(id1 + "---" + name1 + "----" + balance1);*/

            while (rs.next()){
                //循环判断游标是否是最后一行
                int id = rs.getInt(1); //对象接收第一行第一列的值
                String name = rs.getString(2);
                double balance = rs.getDouble(3);
                System.out.println(id + "---" + name + "----" + balance);
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
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
