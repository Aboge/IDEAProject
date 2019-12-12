package demo29;
/*
* 1.接口的默认方法，可以通过直接调用接口实现类对象来使用
* 2。接口实现类也可以覆盖重写接口抽象类的默认default方法。
* */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类MyInterfaceDefaultA的对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs1();//调用抽象方法，世界运行的是实现类中覆盖重写的方法。

        //调用默认方法，如果实现类中没有，会向上找接口中的default的方法
        a.methodDefault();

        System.out.println("==========================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs1();
        b.methodDefault();
    }

}
