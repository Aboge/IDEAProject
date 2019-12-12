package domain;

import java.util.Date;

public class Emp {
    private Integer id;
    private String name;
    private Integer job_id;
    private Integer mgr;
    private Date joindata;
    private Double salary;
    private Double bouns;
    private Integer  dept_id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getJoindata() {
        return joindata;
    }

    public void setJoindata(Date joindata) {
        this.joindata = joindata;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBouns() {
        return bouns;
    }

    public void setBouns(Double bouns) {
        this.bouns = bouns;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }
}