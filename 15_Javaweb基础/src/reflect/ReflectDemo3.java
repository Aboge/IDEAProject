package reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    /*
    * Class对象功能：
		* 获取功能：
			1. 获取成员变量们
				* Field[] getFields() ：获取所有public修饰的成员变量
				* Field getField(String name)   获取指定名称的 public修饰的成员变量

				* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
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

			4. 获取全类名
				* String getName()
    * */

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
//        2. 获取构造方法们
//				* Constructor<?>[] getConstructors()
//				* Constructor<T> getConstructor(类<?>... parameterTypes)
//
//				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
//				* Constructor<?>[] getDeclaredConstructors()
        //获取class类对象的构造方法
        Constructor<Person> constructor = personClass.getConstructor(int.class,String.class);
        System.out.println(constructor);

        //创建对象(带参数)
        Object person = constructor.newInstance(12,"张三");//为成员变量直接赋值
        System.out.println(person);
//        System.out.println(person.getName());  //通过类对象创建的对象无法直接和普通对象一样使用

        System.out.println("--------------------------------");

        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建空参对象
        Person person1 = constructor1.newInstance();
        System.out.println(person1);

        System.out.println("--------------------------------");

        //如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
        Person person2 = personClass.newInstance();
        System.out.println(person);

    }
}
