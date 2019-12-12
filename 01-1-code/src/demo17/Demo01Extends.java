package demo17;
/*
* 在继承的关系中，"子类也就是一个父类"。也就是说，子类可以被当作父类看待。
* 例如：父类是员工，子类是讲师，那么"讲师就是一个员工"。关系：is - a.
*
* 定义一个父类的格式：(一个普通的类定义)
* pubic class 子类名称 extends 父类名称{
*   //...
* }
*
* 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式。
* 1。直接通过子类对象访问成员变量。
*   等号左边是谁，就优先使用谁
* 2。间接通过成员方法访问成员变量。
*   该方法属于谁，就优先用谁，如果没有就向上找
*
* */
public class Demo01Extends {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.method();
        //父类的对象只能使用父类的方法和成员变量，不能访问子类的内容
        System.out.println(employee.age);//10
        System.out.println(employee.wage);//2000


        //Teacher类中的没有写方法，但是继承了父类当中的方法
        Teacher teacher = new Teacher();
        teacher.method();
        System.out.println(teacher.age);//10
        System.out.println(teacher.classroom);//3

        System.out.println("===============");
        //优先访问当前重名的变量所在的类，是子类就先访问子类，不在子类中就访问父类
        System.out.println(teacher.wage);//5000

        System.out.println("===============");
        //这个方法是子类的，优先用子类的，没有在向上找
        teacher.methodZi();//5000
        teacher.methodFu();//2000


        //创建另外一个新的助教的类，继承父类Employee的方法
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
