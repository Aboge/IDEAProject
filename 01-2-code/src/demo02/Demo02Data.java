package demo02;

import java.util.Date;

public class Demo02Data {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }


    /*
    * Data类带参数的构造方法
    * Data（lang data）：传递毫秒值，把毫秒值转换为Data日期
    * */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970

        date = new Date(1324523462364246L);
        System.out.println(date);//Wed Jun 24 23:59:24 CST 43942
    }

    /*
    * Data类的空参数构造方法
    * Data（）获取当前系统的日期和时间
    * */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);//Mon Aug 12 23:00:32 CST 2019
    }

    /*
    * lang getTime()把日期转化为毫秒，相当于System.currentTimeMillis()方法
    *   返回01 08:00:00 CST 1970以来此Date对象表示毫秒
    * */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);//1565622662404

    }


}
