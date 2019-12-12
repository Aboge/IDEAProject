package demo34;
/*
* 当final关键字原来修饰一个类的时候，格式：
* public final class 类名称{
*   //...
* }
*
* 含义：当前这个类不能有任何的子类。（太监类）一定是有父类的
* 注意：
* 一个类如果是final的，那么其中所有的成员都不能被覆盖重写（因为没有子类）
* 但是其可以覆盖重写其父类的方法。
* */
public final class MyClass /*extends Object*/ {
    public void method(){
        System.out.println("方法执行！");
    }
}
