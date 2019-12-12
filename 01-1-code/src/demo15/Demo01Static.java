package demo15;
/*
* 如果也给成员变量使用了static关键字，那么变量不在属于对象自己，而是属于所在的类，也就是多个对象共享同一份数据。
* */
public class Demo01Static {
    public static void main(String[] args) {

        Student one = new Student("张三",19);


        one.room = "101教室";
        System.out.println(
                "姓名：" + one.getName() +
                " 年龄：" + one.getAge() +
                " 教室：" + one.room +
                " 学号：" + one.getId());

        Student two = new Student("李四",20);
//        two.room = "101教室";
        System.out.println(
                "姓名：" + two.getName() +
                " 年龄：" + two.getAge() +
                " 教室：" + two.room +
                " 学号：" + two.getId());

    }
}
