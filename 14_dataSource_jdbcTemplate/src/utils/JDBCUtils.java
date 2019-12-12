package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import druid.DruidDemo01;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
* Druid连接池的工具类
* */
public class JDBCUtils {
    //1.定义成员变量DataSource
    private static DataSource ds;

    static {

        Properties pro = new Properties();
        try {
            //1.加载配置文件
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));

            //2.获取DataSource
            ds = DruidDataSourceFactory.createDataSource(pro);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    获取连接
    * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /*
    * 释放资源
    * */
    public static void close(Statement statement,Connection connection){
        /*if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        close(statement,connection,null);
    }
    /*
    * 重载
    * */
    public static void close(Statement statement, Connection connection, ResultSet resultSet){
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //获取连接池的方法
    public static DataSource getDataSource(){
        return ds;
    }


}
