package demo15;
/*
 * 静态代码块的格式是：
 * public class 类名称{
 *   static{
 *       //静态代码块的内容
 *   }
 * }
 *
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次。
 *静态内容总是优先于非静态，所以静态代码块比构造代码块先执行。
 *
 * 静态代码块的典型用途：
 * 用来执行一次性对静态成员变量进行赋值
 * */
public class Demo04Static {
    public static void main(String[] args) {
        //静态方法执行唯一一次，构造方法执行两次
        Person one = new Person();
        Person two = new Person();
    }
}
