package demo01;
/*
* Person类默认继承类object类，所以可以使用Object类的equals方法
* boolean equals(Object obj)   指示其他某个对象是否与此对象"相等"。
* equals方法源码
*        public boolean equals(Object obj) {
        return (this == obj);
    }
    参数：
    Object obj:可以传递任意的对象
    == 比较运算符，返回值是一个boolean类型的值：true / false
    基本数据类型：比较的是值
    引用数据类型：比较的是两个对象的地址值
    this就调用该方法的当前的对象。与参数列表中的obj进行比较
    *


* */
public class Demo02Equals {
    public static void main(String[] args) {
        Person person = new Person("张三",21);
        Person person1 = new Person("李四",21);
        Person person2 = new Person("李四",21);

        System.out.println("person" + person);//persondemo01.Person@60e53b93
        System.out.println("person1" + person1);//person1demo01.Person@5e2de80c

        boolean b = person.equals(person1);
        System.out.println(b);//比较的是地址值，而非内容，故不一样

        person = person1;//将person1的地址值赋值给person
        System.out.println(person.equals(person1));//比较的是地址值，地址一样

        System.out.println(person.getName());//李四   地址赋值后，对象内的变量也变化
        System.out.println(person1.getName());//

        System.out.println("------------------");
        System.out.println(person1.equals(person2));//重写后的equals方法，比较的是属性

    }
}
