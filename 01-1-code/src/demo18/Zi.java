package demo18;

public class Zi extends Fu{
    int num = 20;
    public void method(){
        int num = 30;
        System.out.println("方法中的局部变量" + num);//30 ，局部变量
        System.out.println("本类的成员变量" + this.num);//20，本类的成员变量
        System.out.println("父类的成员变量" + super.num);//10,父类的成员变量
    }

    public void methodZi(){
        System.out.println("子类方法执行！");
    }

    public void method1(){
        System.out.println("子类重名方法执行");
    }
}
