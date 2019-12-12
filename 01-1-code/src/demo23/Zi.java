package demo23;
/*
* super关键字原来访问父类内容，而this关键字原来访问本类内容，用法也有三种：
*
* 1。在本类的成员方法中，访问本类的成员变量
* 2。在本类的成员方法中，访问本类的另外一个成员方法。
* 3。在本类的构造方法中，访问本类的另外一个构造方法。
* 在第三种用法当中要注意：
* A.this(...)调用也必须是构造方法的第一个语句，唯一一个。
* B.super和this两种构造调用，不能同时使用。
* */
public class Zi extends Fu{

    int num = 10;

    public Zi() {
        this(120);//本类的无参构造，调用本类的有参构造
        //super();//和super不能同时存在，都是唯一的第一句语句
    }

    public Zi(int num) {
        this.num = num;
    }

    public void method(){
        int num = 20;
        System.out.println(num);//访问本方法中的变量
        System.out.println(this.num);//访问本类的成员变量
        System.out.println(super.num);//访问父类的成员变量
    }

    public void methodA(){
        this.method();//访问本类的另外一个成员方法
        System.out.println("AAAA");
    }

}
