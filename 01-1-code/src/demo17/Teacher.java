package demo17;
/*
* 定义一个员工的子类，继承与父类Employee
* */
public class Teacher extends Employee {

    int classroom = 03;

    int wage = 5000;

    public void methodZi(){
        //使用的是本类当中的wage，本类当中已经有wage，所以会直接使用本类当中的wage
        System.out.println(wage);
    }
}
