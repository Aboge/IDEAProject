package demo10;
import java.util.Scanner;//导包
/*
* Scanner类的功能，可实现键盘输入数据，到当中
* 引用类型的要把使用步骤：
* 1。导包
* import 包路径，类名称；
* 如果需要使用目标类，和当前类处于同一个包下，则可以省略不写。
* 只有java.long包下的内容可以不需要导包，其他的包都需要import语句。
*
* 2。创建
* 类名称 对象名 = new 类名称（）；
*
* 3。使用
* 对象名.成员方法（）
*
* 获取键盘上输入的一个int数字：int num = sc.nextInt();
* 获取键盘输入的一个字符串： String str = sc.next();
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建
        Scanner sc = new Scanner(System.in);//System.in代表从键盘输入

        //3.获取键盘上的int数字
        System.out.println("请输入数字：");
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);

        System.out.println("请输入字符串：");
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
