package demo08;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();//这就是在调用无参构造方法

        Student stu2 = new Student("张三",10);//调用有参的重载构造方法
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge());

//        如果需要改变对象的成员变量的数据内容，然然还需要使用setxxx的方法
        stu2.setAge(23);
        System.out.println("姓名：" + stu2.getName() + " 年龄：" + stu2.getAge());
    }
}
