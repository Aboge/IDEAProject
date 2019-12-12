package jdbcTemplate;

import domain.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class jdbcTemplateDemo01 {

    //Junit单元测试，可以让方法独立执行

    /*
    * 将template对象设置为private变量，private声明的变量范围是只能在本类中使用，不需要在方法中再次获取
    * */
    //1。获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /*
    * 1.修改1号数据的salary 为 10000
    * */
    @Test //注解需要专门加入工作空间里
    public void test(){
//        System.out.println("我被执行了。。。");

        /*//1。获取JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());*/

        //2.定义sql
        String sql = "update emp set salary  = 10000 where id = 1001";

        //3.执行sql
        int update = template.update(sql);

        System.out.println(update);

    }//测试运行后如果是绿色，则执行成功，如果为红色说明有异常存在

    /*
    * 2。添加一条数据
    * */
    @Test
    public void test2(){
//        System.out.println("再次被执行。。。");
        /*
        //1.获取对JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate((JDBCUtils.getDataSource()));
        */

        //2。定义sql语句
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";

        //3.执行sql语句 ，设置"?"的值
        int update = template.update(sql,1015,"郭靖",10);

        System.out.println(update);
    }

    /*
    * 3。删除刚刚的添加的数据
    * */
    @Test
    public void test3(){
        //2。定义sql
        String sql = "delete from emp where id = ?";
        //3.运行sql
        int update = template.update(sql, 1015);

        System.out.println(update);
    }

    /*
    * 4。查询id为1的记录，将其封装为Map集合
    * 注意：
    *   template.queryForMap()方法封装的结果集长度只能是1
    * */
    @Test
    public void test4(){
        String sql = "select * from emp where id = ?";

        Map<String, Object> stringObjectMap = template.queryForMap(sql, 1001);
        //封装成了Map集合
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}

        System.out.println(stringObjectMap);
    }

    /*
    * 5。查询所有记录，将其封装为list集合
    * 注意：
    *   template.queryForList()方法是将没有一条记录单独封装为Map后，然后将Map集合再次封装为list集合
    * */
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        //将每一条数据先封装为Map集合后，在将其封装为List集合

        //增强for循环将list集合中的每一条记录封装为Map并打印出来
        for (Map<String,Object>stringObjectMap : list){
                System.out.println(stringObjectMap);
        }
    }

    /*
    * 6。1查询所有记录，将其封装为Emp对象的List集合
    * */
    @Test
    public void test6(){
        String sql = "select * from emp";

        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
        //spring定义了这个RowMapper，来让应用去自定义数据库结果集与实体的映射，这样来把变化的部分隔离出去
            //对RowMapper接口进行实例化的重写，通过匿名内部类
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");

                emp.setId(id);
                emp.setName(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindata(joindate);
                emp.setSalary(salary);
                emp.setBouns(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }

    }

    /*
     * 6.2查询所有记录，将其封装为Emp对象的List集合
     * 注意：
     *  BeanPropertyRowMapper 实现了 RowMapper 接口。
     * 使用BeanPropertyRowMapper自动绑定，需要确保数据库表列名称与Java实体类属性名称相同
     * */
    @Test
    public void test6_1(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /*
    * 7。查询总记录数
    * */
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long total = template.queryForObject(sql, long.class);
        System.out.println(total);
    }
}
