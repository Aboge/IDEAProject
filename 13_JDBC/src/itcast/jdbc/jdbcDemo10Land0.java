package itcast.jdbc;

import itcast.jdbc.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class jdbcDemo10Land0 {
    public static void main(String[] args) {
        //1.键盘录入,接收用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        Scanner ps = new Scanner(System.in);
        System.out.println("请输入密码：");
        String password = ps.next();
        //2。调用方法
        boolean flag = new jdbcDemo10Land0().login(username, password);
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
        PreparedStatement pre = null;
        ResultSet resultSet = null;
        try {
            //1。获取数据库连接
            connection = JDBCUtils.getConnection();
            //2.定义sql命令
            String sql = "select * from USER where username = ? and password  = ? ";

            //3。获取执行sql语句的对象
            pre = connection.prepareStatement(sql);

            //给？赋值
            pre.setString(1,username);//给第一个"?"赋值
            pre.setString(2,password);//给第二个"?"赋值
            //4.执行sql语句
            resultSet = pre.executeQuery();

            //5。判断结果是否执行成功
            /*if (resultSet.next()){
                return true;
            }else{
                return false;
            }*/
            return resultSet.next();//如果有下一行，说明语句执行成功，查找的结果存在



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(resultSet,pre,connection);
        }

        return false;
    }
}
