package demo27;
/*
* 抽象类的注意事项：
* 1。抽象类不能直接创建对象
* 2。抽象类中，可以构造方法，是供子类创建对象时，初始化父类成员使用
* 3。抽象类当中，不一定有抽象方法，但是有抽象方法的类一定是抽象类
*    这样的没有抽象方法的抽象类，也不能直接创建对象，在一些特殊的场景下使用。
* 4。抽象类的子类，必须重写抽象父类的所有抽象方法，否则编辑无法通过，除非该子类也是抽象类。
* */
public class Main {
    public static void main(String[] args) {
        Zi zi =new Zi();
//        Fu fu = new Fu();//不能直接创建抽象类-父类的对象
        zi.method();//父类的构造方法执行只能在子类的super调用中使用，不能直接创建新的父类的对象

        System.out.println("===========构造方法执行===========");
//        Fu fu = new Fu();    //抽象父类，不能直接创建抽象类-父类的对象
//        Zi1 zi1 = new Zi1(); //错误，子类Zi1也是抽象类，不能直接创建对象
        Sun sun = new Sun();   //普通子类，可以直接创建对象
        Sun1 sun1 = new Sun1();

        System.out.println("============子类Sun方法执行===========");

        //首先运行祖先父类的构造方法，在子类
        sun.method();//这是抽象子类Zi1对父类Fu进行覆盖重写的方法
        sun.methodA();//对父类Zi1的methodA方法的重写
        System.out.println("===========子类Sun1方法执行============");
        sun1.methodA();//对父类Zi1的methodA方法的另外一种重写

    }
}
