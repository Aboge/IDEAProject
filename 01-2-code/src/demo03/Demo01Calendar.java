package demo03;
import java.util.Calendar;

/*
    java.itcast.jdbc.util.Calendar类:日历类
    Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
    Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态
        //Calender类重写了toString方法
        System.out.println(c);//java.itcast.jdbc.util.GregorianCalendar[time=1565688408956,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.itcast.jdbc.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2019,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=26,SECOND=48,MILLISECOND=956,ZONE_OFFSET=28800000,DST_OFFSET=0]
    }

}