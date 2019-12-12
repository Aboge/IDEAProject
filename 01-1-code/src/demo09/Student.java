package demo09;
/*
* 一个标准的类通常拥有下面四个组成部分：
* 1。所有的成员变量都要使用private关键字修饰
* 2。为每个成员变量编写一对Getter/Setter方法
* 3。编写一个无参数的构造方法
* 4。编写一个全参数的构造方法
*
* 这样标注的类也叫Java Bean
* */
public class Student {

    private String name;//姓名
    private int age;//年龄

//    command + n 快捷键来直接生成相应的标准代码

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
