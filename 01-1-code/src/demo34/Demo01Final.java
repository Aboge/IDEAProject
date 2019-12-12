package demo34;
/*
* final关键字也是代表最终、不可改变的。
* 常见的四种用法：
* 1。可以原来修饰一个类
* 2。可以原来修饰一个方法
* 3。还可以原来修饰也给局部变量
* 4。还可以原来修饰一个成员变量
*
* */
public class Demo01Final {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();

        Fu fu = new Fu();
        fu.methodFinal();

        int num1 = 10;
        System.out.println(num1);
        final int num2 = 20;
        System.out.println(num2);
//        num2 = 30;//final修饰的变量不能更改
//        num2 = 20;//只能被赋值一次，不能再次赋值
        final int num3;
        num3 = 30;//只能进行唯一的一次赋值

        System.out.println("---------------------------");

        //对于基本类型的来说，不可变的是变量当中的数据不可变
        //对于引用类型来说，不可变的是变量当中的地址值不可改变
        Student student = new Student("张三");
        System.out.println(student.getName());//张三
        System.out.println(student);
        student = new Student("李四");
        System.out.println(student.getName());//李四
        System.out.println(student);

        final Student student1 = new Student("王五");
        //final修饰的引用型变量，其中的地址值不可改变。
//        student1 = new Student("赵六");//错误
        System.out.println(student1);
        student1.setName("赵六！");
        System.out.println(student1.getName());//student1的地址没有变，但是通过其中的方法可以改变值
        System.out.println(student1);//前后地址不变

    }
}
