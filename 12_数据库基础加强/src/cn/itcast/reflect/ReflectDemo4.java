package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {

    /**
     Class对象功能：
         * 获取功能：
         1. 获取成员变量们
             * Field[] getFields()
             * Field getField(String name)

             * Field[] getDeclaredFields()
             * Field getDeclaredField(String name)
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
          3. 获取成员方法们：

            只能访问公共的成员方法
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>... parameterTypes)


             暴力反射后，可以访问私有的方法
             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法，需要传递对象和实参数
        eat_method.invoke(p);

        //获取指定带参数的方法，需要传递指定名称的方法和其指定的参数类型
        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p,"饭");

        System.out.println("-----------------");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();//获取所有的方法，Person类中的所有的公有的方法，以及其继承父类Object的方法
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();//获取方法的名称
            System.out.println(name);

            //method.setAccessible(true);//暴力反射后可以访问所有的方法，包括私有的
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);//cn.itcast.itcast.jdbc.domain.Person  全类名

    }


}
