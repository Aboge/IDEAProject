package itcast.jdbc;

import itcast.jdbc.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
* 定义一个方法。查询emp表所有的数据将其封装为对象，然后装载集合，返回该集合的值
* */
public class jdbcDemo08_select {
    /*
    * 查询所有的emp对象
    *
    * */
    public List<Emp> findAll(){  //定义一个List<Emp>类型的集合类型的方法，返回值是list类型

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        List<Emp> list = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取链接
            connection = DriverManager.getConnection("jdbc:mysql:///travel", "root", "123456");
            //3.获取执行sql语句的对象
            statement = connection.createStatement();
            //4。定义sql语句
            String sql = "select * from emp";
            //5.执行sql
            rs = statement.executeQuery(sql);
            //6.遍历结果集

            Emp emp = null;//创建Emp类型的引用变量

            list = new ArrayList<Emp>();
            while (rs.next()){
                //获取数据
                int id = rs.getInt("id");
                String name = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                //创建cmp对象,并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setBouns(bonus);
                emp.setDept_id(dept_id);
                emp.setSalary(salary);
                emp.setJoindata(joindate);

                //装载对象
                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


        return list;
    }

    public static void main(String[] args) {
        List<Emp> list = new jdbcDemo08_select().findAll();
        System.out.println(list);
    }
}
