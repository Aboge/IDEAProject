package demo17;

//定义一个父类：员工
public class Employee {
    int age = 10;

    int wage = 2000;

    public void method(){
        System.out.println("继承于父类的方法运行了！");
    }

    public void methodFu(){
        //使用的是本类当中的wage，不会找到子类的
        System.out.println(wage);
    }
}
