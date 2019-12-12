package demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    java.lang.Object
    类Object 是类层次结构的根（父）类。
    每个类（Person，Student。。。）都使用Object作为父类。
    所有对象（包括数组）都实现这个类的方法。
* */
public class Demo01toString {
    /*
    * Person类默认继承了Object类，所以可以使用Object类的toString方法
    * String toString() 返回值对象的字符串表示。
    * */

    public static void main(String[] args) {
        Person person = new Person("张三",20);
        String s = person.toString();

        //toString方法就是求其对象在内存中的地址值
        System.out.println(s);//demo01.Person@60e53b93


        //直接打印对象的名字，其实就是调用对象的toString  person = person.toString
        System.out.println(person);//demo01.Person@60e53b93

        /*看一个类是否重写了toString，直接打印这个类的对象即可，如果没有重写toString方法，那么
        打印对象的地址值
        */
        Random r = new Random();
        System.out.println(r);//java.itcast.jdbc.util.Random@5e2de80c   没有重写toString方法

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);//重写了toString

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3] 重写了toString

    }
}
