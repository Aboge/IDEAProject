package demo15;
/*
注意事项：
根据类名称来访问静态成员变量的时候，全程和对象就没有关系，只和类有关系。

 */
public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "111教室";

        Student one = new Student("张三",20);
        Student two = new Student("李四",20);

        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的学号：" + one.getId());
        System.out.println("one的教室：" + Student.room);//room是静态变量

        System.out.println("=============");
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的学号：" + two.getId());
        System.out.println("two的教室：" + Student.room);//room是静态变量
    }
}
