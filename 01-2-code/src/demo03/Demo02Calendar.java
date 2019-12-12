package demo03;

import java.util.Calendar;
import java.util.Date;

/*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();

    }

    /*
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        把日历对象,转换为日期对象
     */
    private static void demo04() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }

    /*
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        把指定的字段增加/减少指定的值
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int amount:增加/减少指定的值
                正数:增加
                负数:减少
     */
    private static void demo03() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();

        //把年增加2年
        c.add(Calendar.YEAR,-3);
        //把月增加两个月
        c.add(Calendar.MONTH,7);

        //改变后的日期为
        System.out.println("改变后的日期为：" + c.get(Calendar.YEAR) + "-" + c.get(Calendar.MONTH) + "-" + c.get(Calendar.DATE));

    }

    /*
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        参数:
            int field:传递指定的日历字段(YEAR,MONTH...)
            int value:给指定字段设置的值
     */
    private static void demo02() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();//使用默认时区和语言环境获得一个日历,里面包含有日期等信息


        //设置年为9999
        c.set(Calendar.YEAR,9999);
        //设置月为09
        c.set(Calendar.MONTH,9);
        //设置日期为9日
        c.set(Calendar.DATE,9);

        //可以同时设置年，月，日,set的重载方法
        c.set(8888,8,8);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    /*
    public int get(int field)：返回给定日历字段的值。
    参数：传递指定的日历字段（YERA，MONTH...）
    返回值：日历字段代表的具体的值
    * */
    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();//使用默认时区和语言环境获得一个日历,里面包含有日期等信息
//        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份为0-11，在此基础上要+1

        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }


}