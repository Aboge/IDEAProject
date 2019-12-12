package itcast.jdbc;

import itcast.jdbc.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class jdbcDemo10Land1 {
    public static void main(String[] args) {
        //1.键盘录入,接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        Scanner ps = new Scanner(System.in);
        System.out.println("请输入密码：");
        String password = ps.next();
        //2。调用方法
        boolean flag = new jdbcDemo10Land1().login(username, password);
        //3。判断结果，判断是否登陆成功,输出不同结果
        if (flag){
            System.out.println("登陆成功！");
        }else {
            System.out.println("用户名或者密码错误");
        }

    }
    /*
    * 登陆方法
    * */
    public boolean login(String username,String password){


        if (username == null || password == null){
            return false;
        }
        //连接数据库，判断对比username和password是否一致

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //1。获取数据库连接
            connection = DriverManager.getConnection("jdbc:mysql:///db1","root","123456");
            //2.定义sql命令
            String sql = "select * from db1.USER where username = '"+username+"' and password  = '"+password+"' ";
            //加上"++"的原因是这两个参数是变量，没有的话就变成字符串了

            //3。获取执行sql语句的对象
            statement = connection.createStatement();

            //4.执行sql语句
            resultSet = statement.executeQuery(sql);

            //5。判断结果是否执行成功
            /*if (resultSet.next()){
                return true;
            }else{
                return false;
            }*/

            return resultSet.next();//如果有下一行，说明语句执行成功，查找的结果存在



        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,statement,connection);
        }

        return false;
    }
}
