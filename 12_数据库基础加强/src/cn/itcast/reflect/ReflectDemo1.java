package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

public class ReflectDemo1 {


/*
* 框架：半成品软件，可以在框架的基础上进行软件开发，简化代码
* 反射：将类的各个组成部分分装为其他对象，这就是反射机制
*
*   例如：
*       将成员变量封装为Field[] fields
*       将构造方法封装为Construct[] cons
*       将成员方法封装为Method[]  methods
*
* 好处：
*   1。在程序运行中来运用这些对象
*   2。可以解耦，提高程序的扩展性
*
*
* 反射就是将类的各种成分映射成各种类，我们知道一个java类可以用一个class的对象来表示，
* 这个类的组成成分有名字、变量、构造方法等信息，我们当然可以用一个个java类的表示。
* 换句话说，表示java类的Class类提供了一系列的方法给我们用来获取其中的变量、方法、构造方法等信息，
* 这些信息也有相应的类的实例来表示，也就是Field、Method、Constructor等等。
* */

    /**
        获取Class对象的方式：
            1. 类还在源代码阶段，只在硬盘中生成了.class文件，还没有加载进入内存文件，需要手动将其加载入内存
                Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
            *多用于配置文件，将类名定义在配置文件当中，读取文件，加载类
     *
            2. 反射阶段，已经将类中的各个部分反射为各种class类对象
                类名.class：通过类名的属性class获取
            *多用于参数的传递
     *
            3. 已经加载入内存，存在Person对象了，可以直接构造类的实例对象来使用
                对象.getClass()：getClass()方法在Object类中定义着。
            *多用于对象的获取字节码的方式

     */
    public static void main(String[] args) throws Exception {

        //1.Class.forName("全类名")，调用Class类的静态方法来获取对应指定名称的类的字节码，该方法会抛出异常
        Class cls1 = Class.forName("cn.itcast.domain.Person");//需要传递全类名，包括包名和类名
        System.out.println(cls1);
        //2.类名.class，直接通过Person类来获取字节码
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true


        /*
        * 在java的虚拟机中，每一个类都会被保存成为一个字节码，用来保存该类的信息如名字、父类、变量、方法等。
        * 一个类的字节码在虚拟机中有且只有一个，也就是在第一次加载该类的时候会将类的字节码加载到java虚拟机中，
        * 而上面有三种方法可以从虚拟机中获取类的字节码，不论通过哪种方式获取的字节码文件都是同一个
        * */

        Class c = Student.class;
        System.out.println(c == cls1);//false

        /*
        * 每个类在java虚拟机中生成的字节码文件都是唯一的
        * */

    }
}
