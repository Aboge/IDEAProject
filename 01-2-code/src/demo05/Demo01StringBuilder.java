package demo05;
/*
String类
    字符串是常量，他们的值在创建后不能更改。
    字符串的底层是一个被final修饰的数组，不能改变，是一个常量
    private final byte[] value;

    进行字符串的相加，内存中就会多个字符串，占用空间，效率低下
    String s = "a" + "b" + "c" = "abc";
    String s会产生"a"，"b"，"c"，"ab"，"abc"五个字符串

    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率，
    底层也是一个数组，但是没有被final修饰，可以改变长度
    byte[] value = new byte[16];
    "a" + "b" + "c" = "abc"
    通过数组依次存放"a"，"b"，"c"，"abc"
    StringBuilder在内存中始终只占用也给数组，占用的空间少，效率高
    当存放超出数组的容量时，数组会自动扩容

    java.lang.StringBuilder类:字符串缓冲区,可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {

        //空参数构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);//bu1:""

        //带参数的构造
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu1:" + bu2);//bu2:abc


    }
}
