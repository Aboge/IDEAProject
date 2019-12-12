package demo15;
/*
* 一旦使用了static修饰了成员方法，那么这就成了静态方法，静态方法不属于对象，而是属于类的。
*
* 如果没有static关键字修饰，那么必须首先要创建对象，然后通过对象才能使用它。
* 如果有来static关键字，那么可以不要创建对象，直接通过类名称来进行方法调用。
*
* 无论是成员变量，还是成员方法，如果有static，都可以直接通过类名称来进行调用。
* 静态变量：类名称.静态变量名
* 静态方法：类名称.静态方法名（）
*
* 注意事项：
1。静态方法不能直接访问非静态变量
* 原因：在内存当中是【先】有静态内容，【后】有非静态内容
* "先人不知后人，后人知道先人"
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        Myclass obj = new Myclass();//首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();


        //对于静态方法来说可以通过对象名来进行调用，也可以直接通过类名称来进行调用
        obj.methodStatic();//通过对象名称来进行调用（不推荐），这种写法也会被Java翻译成"类名称.静态方法名"来调用
        Myclass.methodStatic();//通过直接调用类名称来进行调用

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();//完全等效，翻译后的结果

    }

    public static  void myMethod(){
        System.out.println("自己的方法！");
    }
}
