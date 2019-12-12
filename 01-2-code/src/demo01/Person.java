package demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //直接打印对象的地址值没意义，需要重写toString方法
    //直接打印对象的属性（姓名，年龄）
   /* @Override
    public String toString(){
//        return "abc";
        return "Person{name:" + name + ",age:" + age + "}";
    }
*/

/*
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

//  快捷键：command + n --> toString
    /*
    * Object类的equals默认比较的是两个对象的地址值，没有意义
    * 需要重写equals方法,比较两个对象的属性（name，age。。。）
    *   存在的问题：
    *       隐含这一个多态
    *       多态的弊端：无法使用子类特有的内容（属性和方法）
    *       Object obj  = person1 = new Person（"张三"，20）；
    *       解决：可以使用向下转型（强转）把obj类型转换为Person
    * */
//    对equals方法的重写
    /*@Override
    public boolean equals(Object obj) {
        //增加一个判断，如果传递的是this本身，那么直接放回true
        if (obj == this){
            return true;
        }
        //增加一个判断，传递的值为空，直接返回false,可以提高参数的效率
        if (obj == null){
            return false;
        }
        //增加一个判断，防止强转异常
        if (obj instanceof Person) {  //只有Person类型的对象才能进行强转，并比较
            //使用向下转型，把obj转换为Person类
            Person p = (Person) obj;
            //比较两个对象的属性，一个对象this（person），一个对象是person1（obj->Person）
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        //不是Person类型，直接返回false
        return false;
    }*/
//    快捷键：command + n --> equanls and hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//使用反射技术判断o是否是Person类型
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
