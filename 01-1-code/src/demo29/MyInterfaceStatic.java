package demo29;
/*
* 从Java 8开始，接口当中允许定义静态方法。
* 格式：
* public static 返回值类型 方法名称（参数列表 ）{
*   //...
* }
* 提示：就是将abstract或者default换成static即可，带上方法体。
*/
public interface MyInterfaceStatic {

    //新建静态static方法
    public static void methodstatic(){
        System.out.println("这是接口的静态方法！");
    }

    public static void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public static void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    public static void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    //jdk1.8版本不支持，1.9以上支持该写法,使用private修饰的私有方法只能在该接口内进行访问，接口实现类不能访问
    /*private static void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/
}
