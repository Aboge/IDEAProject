package itcast.jdbc.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
* JDBC工具类
* 抽取了JDBC的操作方法
* */
public class JDBCUtils {

    /*
    * 文件的读取，只需要读取一次即可拿到这些值，使用静态代码块。随着类的加载而加载，只会执行一次
    * 因此将这些值声明为静态的成员变量,并在静态代码块中为其赋值（只需要读取一次）
    * */
    /*
    * 将这个变量设置为静态的，这样才能被静态代码块内的方法所访问*/
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    //加载配置文件
    static {            //静态代码块，只能在内部处理异常，而不能抛出
        try {
            //1.创建Properties集合类，读取配置文件中的值
            Properties pro = new Properties();

            //获取src路径下的文件的方式---->CLassLoader 类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");//URL统一资源定位符
            String path = resource.getPath();//获取加载文件的绝对路径
//            System.out.println(path);

            //2。加载文件,加载配置文件中的值
            pro.load(new FileReader(path));
            //3.获取数据，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");

            //4.注册驱动
            Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    * 获取连接
    * @return 连接对象
    * 抽取一个方法获取连接对象
			* 需求：不想传递参数（麻烦），还得保证工具类的通用性。
			* 解决：配置文件
				jdbc.properties
					url=
					user=
					password=
    * */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    /*
    * 释放资源close（）
    * */
    public static void close(Statement stmt,Connection conn){
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //释放资源方法重载，增加一个resultSet对象的资源释放
    public static void close(ResultSet rs, Statement stmt, Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
