package druid;
/*
* Druid演示
* */
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        //1。导入jar包
        //2。定义配置文件
        //druid.properties 配置文件，放在src文件夹下
        //3。加载配置文件
        Properties pro = new Properties();

        InputStream rs = DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");

        pro.load(rs);

        //4。获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //5.获取连接
        Connection connection = dataSource.getConnection();

        //6.打印
        System.out.println(connection);
    }
}
