package druid;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 使用新的工具类
* */
public class DruidDemo02 {
    public static void main(String[] args) {
        /*
         * 完成一个添加的操作，给account表添加一条数据
         * */
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            //1。获取连接
            connection = JDBCUtils.getConnection();

            //2.定义sql
            String sql = "insert into account values(null,?,?)";

            //3.获取pstmt操作对象
            pstmt = connection.prepareStatement(sql);

            //4。执行sql语句前要给"?"赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);

            //5.执行sql
            int i = pstmt.executeUpdate();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,connection);
        }
    }
}
