package itcast.jdbc;

import itcast.jdbc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 事物操作
* */
public class jdbcDemo11 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            //1.获取数据库连接
             connection = JDBCUtils.getConnection();
//开启事务
            connection.setAutoCommit(false);

            //2.定义sql
            //2。1张三减500
            String sql1 = "update account set balance = balance - ? where id = ?";
            //2。2李四加500
            String sql2 = "update account set balance = balance + ? where id = ?";
            //3.获取操作sql语句的对象
            pstmt1 = connection.prepareStatement(sql1);
            pstmt2 = connection.prepareStatement(sql2);

            //4.设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);

            //5.执行修改命令
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

//提交事物
            connection.commit();

        } catch (Exception e) {
            try {
                //事物执行过程中发生异常，被catch补货处理
                //在开启事物的前提下才会进行回滚操作
                if (connection != null){
                    connection.rollback();
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,connection);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
