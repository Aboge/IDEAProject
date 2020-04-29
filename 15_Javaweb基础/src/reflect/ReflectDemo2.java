package reflect;

import domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
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
        //0.获取person的class对象
        Class personClass = Person.class;

        //1.获取成员变量们
//            * Field[] getFields() ：获取所有public修饰的成员变量
//            * Field getField(String name)   获取指定名称的 public修饰的成员变量
//
//			  * Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
//            * Field getDeclaredField(String name)

//        * Field：成员变量
//            * 操作：
        //        1. 设置值
        //                * void set(Object obj, Object value)
        //        2. 获取值
        //                * get(Object obj)
        //
        //        3. 忽略访问权限修饰符的安全检查
        //                * setAccessible(true):暴力反射

        //1.Field[] getFields() 获取public的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
            //public int domain.Person.age  public java.lang.String domain.Person.a
            //只能获取public成员变量
        }

        System.out.println("---------------------------------");


        //2.获取成员变量的值 get(Object obj)
        Field age = personClass.getField("age");
        Person p = new Person();
        Object value = age.get(p);
        System.out.println(value); //0

//        使用类的构造方法来获取的p对象的age成员变量的值
//        int age1 = p.getAge();
//        System.out.println(age1);


        //设置p对象的age的值
        age.set(p,10);
        System.out.println(age.get(p));//10


        System.out.println("---------------------------------");

        //3.Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
        Field[] allFields = personClass.getDeclaredFields();
        for (Field allField : allFields) {
            System.out.println(allField);
            //可以获取所有类型的成员变量
        }

        System.out.println("---------------------------------");

        //4.Field[] getDeclaredField("name")  获取指定名字的成员变量，不考虑修饰符
        Field name = personClass.getDeclaredField("name");
//        Object name1 = name.get(personClass); //直接访问private类型的成员变量无法直接读取。
//        System.out.println(name1);

        //忽略访问权限修饰符的检查,暴力反射
        name.setAccessible(true);//忽略指定成员变量的访问权限检查
        Object name2 = name.get(p);
        System.out.println(name2);



    }
}
