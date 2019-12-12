package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
* c3p0演示
* */
public class c3p0Demo02 {
    public static void main(String[] args) throws SQLException {
        //1.获取Datasource，使用的是默认的配置
        DataSource ds = new ComboPooledDataSource();

        //2.获取连接
        for (int i = 0; i < 11; i++) {
            Connection connection = ds.getConnection();
            System.out.println(i + ": " + connection);

            if (i == 5){
                connection.close();//归还连接到连接池，因此接下来的新的连接可以继续使用
            }
        }
//        testNameConfig();
    }

    public static void testNameConfig() throws SQLException {
        //1。1使用指定名称的配置，传递指定名称的
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        //3.打印
        for (int i = 0; i < 8; i++) {
            //2.获取连接
            Connection connection = ds.getConnection();
            System.out.println(i + ": " + connection);
        }
    }
}
