package demo07;
/*
* 局部变量和成员变量
* 1。定义的位置不一样【重点】
* 局部变量：在方法的内部
* 成员变量：在方法的外部，直接写在类中
*
* 2。作用的范围不一样【重点】
* 局部变量：只有在方法内有效，出了方法就失去作用
* 成员变量：在整个类中都有效
*
* 3。默认值不一样【重点】
* 局部变量：没有默认值，如果想要使用，必须进行手动赋值
* 成员变量：如果没有赋值，会有默认值，规则和数组一样。
*
* 4。内存的位置不一样
* 局部变量：位于栈内存
* 成员变量：位于堆内存
*
* 5。生命周期不一样
* 局部变量：随着进栈而诞生，随着方法出栈而消失
* 成员变量：随着对象创建而诞生，随着内存回收而消失
* */
public class Demo01VariableDifference {

    String name;//成员变量

    public void method(){
        int num = 10;//局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void method01(int param){ //方法的参数就是局部变量，在方法被调用的时候会被赋值
        int age;

//      System.out.println(age); //局部变量必须进行赋值，没赋值不能使用

//      System.out.println(num); //num是method方法的内部变量，其他方法不能使用
        System.out.println(name);//name是成员变量，类里都可以使用


    }
}
