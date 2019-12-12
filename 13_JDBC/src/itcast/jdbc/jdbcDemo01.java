package itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo01 {


    public static void main(String[] args) throws Exception {

        //1。导入驱动jar包
        //2。注册驱动
//        Class.forName("com.mysql.jdbc.Driver");  //注意mysql之后的jar包可以省略注册驱动

        //3。获取数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","123456");
        //4.定义sql语句
        String sql = "update account set balance = 1000 where id = 1";
        //5.获取执行sql的对象statement
        Statement statement = connection.createStatement();
        //6.执行sql
        int count = statement.executeUpdate(sql);//执行DML（insert，update，delete）语句，DDL（create，alter，drop）语句
        //7。处理结果
        System.out.println(count);//返回值就是mysql中受到影响的行数，以此判断DML语句是否执行成功
        //8。释放资源
        statement.close();
        connection.close();


        /*//1. 导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123456");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();*/
    }


}
