package demo16;
/*
* java.lang.Math类是数学相关的工具类，里面提供类大量与数学相关的静态方法，完成与数学运算相关的操作。
*
* public static double abs(double num):获取绝对值。
* public static double ceil(double num):向上取整
* public static double floor(double num):向下取整
* public static double round(double num):四舍五入
*
*Math.PI
* */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值,可以有多种重载
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(0));//0
        System.out.println(Math.abs(-3.14));//3.14

        System.out.println("=========================");
        //向上取整
        System.out.println(Math.ceil(2.1));//3
        System.out.println(Math.ceil(3.9));//4

        System.out.println("=========================");
        //向下取整
        System.out.println(Math.floor(4.9));//4
        System.out.println(Math.floor(3.2));//3

        System.out.println("=========================");
        //四舍五入,不带小数点
        System.out.println(Math.round(3.4));//3
        System.out.println(Math.round(4.5));//5

        System.out.println("=========================");
        System.out.println(Math.PI);

    }
}
