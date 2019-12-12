package cn.itcast.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 * 需求：写一个"框架"，在不改变任何代码的前提下，可帮助我们创建任意类的对象，并且执行其中的任意方法
 * 实现：
 *      1.配置文件
 *      2.反射
 *   步骤：
 *      1.将需要的创建的对象的全类名和需要执行的方法定义在配置文件当中
 *      2.在程序中加载读取配置文件
 *      3.使用反射技术来加载读取类文件进内存
 *      4.创建对象
 *      5.执行方法
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象，可以执行任意方法

        /*
            前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
      /*  Person p = new Person();
        p.eat();*/
/*
        Student stu = new Student();
        stu.sleep();*/

        //1.加载配置文件
        //1.1创建Properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件，获取字解码文件的类加载器，将类文件加载进内存当中
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        //ReflectTest.class是ReflectTest的字解码文件（经过javac编译后的），getCLassLoader是其类加载器
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        //通过类加载器找到配置文件pro.properties，并通过getResourceAsStream方法返回路径字节流
        //load方法加载指定的文件名（完整的路径名）作为动态库
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        System.out.println(className);

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);


    }
}
