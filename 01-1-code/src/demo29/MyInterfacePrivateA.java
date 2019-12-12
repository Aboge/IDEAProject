package demo29;
/*
* 问题描述：
* 我们需要抽取一个共有方法，原来解决两个默认方法之间重复代码的问题。
* 但是这个共有的方法不应该有实现类使用，应该私有化。
*
* 解决方法：
* 从Java9开始，接口当中允许定义私有方法。
* 1。普通私有方法，解决多个默认方法之间重复代码问题。
* 格式：
* private 返回值类型 方法名称（）{
*   方法体
* }
*
* 2。静态私有方法，解决多个静态方法之间重复代码问题。
* 格式：
* private static 返回值类型 方法名称（）{
*   方法体
* }
* */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    //会被实现类访问到，不需要被访问
    public default void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    //jdk1.8版本不支持，1.9以上支持该写法,使用private修饰的私有方法只能在该接口内进行访问，接口实现类不能访问
    /*private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/
}
