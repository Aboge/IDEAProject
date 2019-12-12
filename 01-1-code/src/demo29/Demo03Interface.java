package demo29;
/*
* 注意：不能通过接口实现类的对象来调用接口当中的静态方法。
* 正确用法：通过接口名称直接调用静态方法。
* */
public class Demo03Interface {

    public static void main(String[] args) {
        MyInterfaceStaticImpl imple = new MyInterfaceStaticImpl();

        //错误写法！
//        imple.methodStatic();

        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodstatic();
    }
}
