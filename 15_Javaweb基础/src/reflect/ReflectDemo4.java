package reflect;

import domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
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
        //3. 获取成员方法们：
        //				* Method[] getMethods()    //只能获取public类型的方法
        //				* Method getMethod(String name, 类<?>... parameterTypes)
        //
        //				* Method[] getDeclaredMethods()   //可以获取任意类型的方法，暴力反射
        //				* Method getDeclaredMethod(String name, 类<?>... parameterTypes)

        //获取指定名称的成员方法
        Method method = personClass.getMethod("eat");
        System.out.println(method);

        //执行方法：传递实例对象和方法参数
        //		* Object invoke(Object obj, Object... args)
        //创建对象来使用该方法
        Person person = new Person();
        method.invoke(person);

        //直接获取指定名称，且带有指定类型参数的方法
        Method method1 = personClass.getMethod("eat", String.class);
        //执行方法，需要指定实参
        method1.invoke(person,"吃饭");

        System.out.println("-------------------------------------");

        //获取所有的public类型的方法
        Method[] methods = personClass.getMethods();

        for (Method all_method : methods) {

            String name = all_method.getName(); //获取方法的名称
            System.out.println(name);

            System.out.println(all_method);
        }



    }
}
