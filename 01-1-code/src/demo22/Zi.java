package demo22;
/*
 * super关键字的用法有三种：
 * 1。在子类的成员方法中，访问父类的成员变量
 * 2。在子类的成员方法中访问父类的成员方法。
 * 3。在子类的构造方法当中访问子类的构造方法。
 * */
public class Zi extends Fu {

    int num = 10;

    public Zi() {
        super();//在子类的构造方法当中访问父类的构造方法
    }

    public void methodZi(){
        System.out.println(super.num);
    }

    public void method(){
        super.method();//访问父类的成员方法
        System.out.println("子类成员方法！");
    }
}
