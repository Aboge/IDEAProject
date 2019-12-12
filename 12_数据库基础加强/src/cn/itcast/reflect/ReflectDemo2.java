package cn.itcast.reflect;

import cn.itcast.domain.Person;
import cn.itcast.domain.Student;

import java.lang.reflect.Field;

public class ReflectDemo2 {

    /**
     Class对象功能：
         * 获取功能：
         1. 获取成员变量们
             * Field[] getFields()          //获取所有的成员变量
             * Field getField(String name)  //获取指定名称的成员变量

             * Field[] getDeclaredFields()  //获取包括私有对象在内的所有的成员变量
             * Field getDeclaredField(String name)  //获取指定名称的成员变量（包括获取私有的成员变量）
         2. 获取构造方法们
             * Constructor<?>[] getConstructors()
             * Constructor<T> getConstructor(类<?>... parameterTypes)

             * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
             * Constructor<?>[] getDeclaredConstructors()
         3. 获取成员方法们：
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>... parameterTypes)

             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

         4. 获取类名
             * String getName()



     */

    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;

        /*
             1. 获取成员变量们
                 * Field[] getFields()
                 * Field getField(String name)

                 * Field[] getDeclaredFields()
                 * Field getDeclaredField(String name)

         */
        //1.Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);//public java.lang.String cn.itcast.itcast.jdbc.domain.Person.a
        }

        System.out.println("------------");
        //2.Field getField(String name) 获取指定名称的成员对象（public类型的）
        Field a = personClass.getField("a");
        //获取成员变量a 的值
        Person p = new Person();//首先需要新建一个实例对象
        Object value = a.get(p);//获取实例对象的值
        System.out.println(value);
        System.out.println(p);//打印实例对象的值（重写了toString方法）
        //设置a的值
        a.set(p,"张三");//设置实例对象指定成员变量的值
        System.out.println(p);

        System.out.println("===================");

        //Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符（public,private...）
        Field[] declaredFields = personClass.getDeclaredFields();//获取所有的成员变量，包括private
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");//指定名称的成员变量
        //私有的成员变量的值不能直接访问
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
        //在暴力反射后也可也进行私有成员变量的值的跟变
        d.set(p,"李四");
        System.out.println(d.get(p));

    }


}
