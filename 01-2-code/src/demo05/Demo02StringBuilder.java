package demo05;
/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建一个空的StringBuilder
        StringBuilder bu1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象bu1，this = bu1
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1 == bu2);//地址一样

        //使用append方法不需要返回值
        bu1.append("abc");
        bu1.append(1);
        bu1.append(9.0);
        bu1.append("中国");
        System.out.println(bu1);

        /*
        * 链式编程：方法返回值是一个字符串，可以继续调用
        * */
        StringBuilder x = new StringBuilder();
        System.out.println(x.append(1.2).append("abc").append('a').append("中国"));
        System.out.println(new StringBuilder().append(1.2).append("abc").append('a').append("中国"));
    }
}
