package demo15;
/*
* 注意事项：
* 1。静态方法不能直接访问非静态变量
* 原因：在内存当中是【先】有静态内容，【后】有非静态内容
* "先人不知后人，后人知道先人"
*
* 2。静态方法当中不能写this.xxx
* 原因：this代表的是当前的对象，通过谁调用的方法，谁就是当前对象
* */
public class Myclass {

    int num;//成员变量
    static int numstatic;//静态成员变量

    //成员方法
    public void method(){
        System.out.println("这是一个普通的成员方法！");
        //成员方法可以直接访问成员变量
        System.out.println(num);
        System.out.println(this.num);//this.num代表的就是Myclass.num,this代表当前使用的对象
        //成员方法可以直接访问静态成员变量
        System.out.println(numstatic);
    }


    //静态成员方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法！");
        //静态方法不能直接访问成员方法
//        System.out.println(num);

        //静态方法可以直接访问静态成员变量
        System.out.println(numstatic);

        //静态方法不需要对象，所以无法使用this，this代表的是当前使用的对象名
//        System.out.println(this);

    }
}
