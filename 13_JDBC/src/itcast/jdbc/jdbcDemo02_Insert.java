package itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
* account 表 添加以条记录 insert语句
 */
public class jdbcDemo02_Insert {
    public static void main(String[] args){

        //提升作用域到catch外，在finally中释放内存资源
        Statement statement = null;
        Connection connection = null;

        try {
            //1.注册jar包驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "insert into account() values(null,'王五',3000)";

            //3.获取connection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "123456");

            //4.获取执行sql的对象 Statement
            statement = connection.createStatement();

            //5.执行sql
            int i = statement.executeUpdate(sql);

            //6.处理结果
            System.out.println("执行结果是"+i);
            if (i > 0){
                System.out.println("添加成功！");
            }else {
                System.out.println("添加失败！");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //为了避免statement和connection在未被赋值的时候就执行了释放语句而导致空指针异常，故需要先行判断对象是否为null
            /*statement.close();
            connection.close();*/

            //7.先判断不为空，排除空指针异常
            if(statement != null){
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
        }

    }
}
