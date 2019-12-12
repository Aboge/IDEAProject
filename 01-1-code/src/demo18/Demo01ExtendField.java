package demo18;
/*
* 局部变量访问：         直接写成员变量名
* 本类的成员变量访问：    this.成员变量名
* 父类的成员变量访问：    super.成员变量名
*
* 在父子类的继承关系中，创建子类对象，访问成员方法的规则：
*   创建的对象是谁，就优先用谁，没有再往上找
*
* 注意事项：
* 无论是成员方法还是成员变量，如果没有都是向上找父类，而不会向下找子类。
*
* 重写（Override）
* 概念：在继承关系中，方法的名称一样，参数列表也一样。
*
* 重写（Override）：方法的名称一样，参数列表【也一样】。覆盖、覆写
* 重载（Overload）：方法的名称一样，参数列表【不一样】。
*
* 方法覆盖重写特点：创建的对象的类是谁就用谁的类中的方法
*
* */
public class Demo01ExtendField {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();

        System.out.println("==================");

        Zi zi1 = new Zi();
        zi1.methodZi();
        zi1.methodFu();

        Fu fu = new Fu();

        System.out.println("==================");

        zi1.method1();//子类重名方法执行
        fu.method1();//父类重名方法执行
    }
}
