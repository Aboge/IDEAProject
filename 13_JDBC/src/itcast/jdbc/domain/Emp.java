package itcast.jdbc.domain;
/*
* * 练习：
				* 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
					1. 定义Emp类
					2. 定义方法 public List<Emp> findAll(){}
					3. 实现方法 select * from emp;
					*
	封装Emp表数据的JavaBean
* */
import java.util.Date;

public class Emp {
    private int id;
    private String name;
    private int job_id;
    private int mgr;
    private Date joindata;
    private double salary;
    private double bouns;
    private int  dept_id;

    //重写toString方法的目的就是为了避免打印对象的时候打印出来的是地址而非值
    //toString方法默认打印的是地址值
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindata=" + joindata +
                ", salary=" + salary +
                ", bouns=" + bouns +
                ", dept_id=" + dept_id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getJoindata() {
        return joindata;
    }

    public void setJoindata(Date joindata) {
        this.joindata = joindata;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
}
