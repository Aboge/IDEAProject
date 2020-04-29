package reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
* * 案例：
	* 需求：写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
		* 实现：
			1. 配置文件
			2. 反射
		* 步骤：
			1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
			2. 在程序中加载读取配置文件
			3. 使用反射技术来加载类文件进内存
			4. 创建对象
			5. 执行方法
* */
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        //1加载配置文件
        //1.1创建Properties对象
        Properties pro = new Properties();

        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        Class<ReflectTest> reflectTestClass = ReflectTest.class;  //获取class类对象
        ClassLoader classLoader = reflectTestClass.getClassLoader(); //类对象的getClassLoader方法来获取类加载器
        InputStream is = classLoader.getResourceAsStream("pro.properties"); //getResourceAsStream获取对应名称的字节流
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className"); //获取类名称
        String methodName = pro.getProperty("methodName"); //获取配置文件中的方法名称

        //3.加载该类进内存
        Class cls = Class.forName(className); //加载对应名称的类进内存，"反射原理，得到类对象"

        //4.创建类对象的实例对象
        Object obj = cls.newInstance();

        //5.在内存中获取类对象的方法对象
        Method method = cls.getMethod(methodName);

        //6.执行对象的方法
        method.invoke(obj);
    }
}
