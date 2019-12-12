package demo29;
/*
* 在Java 9+中，接口的内容有：
*
* 1。成员变量其实是常量，格式：
* [public static final] 数据类型 常量名称 = 数据值；
* 注意：
*   常量必须进行赋值，而且一旦赋值无法修改。
*   常量名称完全大写，用下划线分隔开
*
* 2。接口中最重要的就是抽象方法，格式：
* [public abstract] 返回值类型 方法名称（参数列表）
* 注意：接口实现类必须覆盖重写所有的抽象方法，除非实现类也是抽象类
*
* 3。从Java 8 开始，接口里允许定义默认方法，格式：
* [public] default 返回值类型 方法名称（参数列表）{方法体}
* 注意：默认方法也可以被覆盖重写
*
* 4。从Java 8 开始，接口里允许定义静态方法，格式：
* [public] static 返回值类型 方法名称（参数列表）{方法体}
* 注意：应该通过接口名称进行方法的调用，不能通过接口实现类对象调用静态方法。
*
* 5。从Java 9开始，接口里允许定义私有方法，格式：
* 普通私有方法：private 返回值类型 方法名称（参数列表）{方法体}
* 静态私有方法：private static 返回值类型 方法名称（参数列表）{方法体}
* 注意：private的方法接口只有接口自己的方法可以调用，不能被实现类或者别人使用。
*
*
* */
public class Demo05Explain /*extends Object 也是Object的子类，可以省略不写*/ implements MyInterfaceExplain,MyInterfaceExplainA{

    //对两个接口的抽象方法都要进行覆盖重写
    @Override
    public void method() {
        System.out.println("覆盖重写了Explain接口的抽象方法");
    }


    @Override
    public void methodA() {
        System.out.println("覆盖重写了ExplainA接口的抽象方法");
    }

    //实现的接口中重复的抽象方法，只需要进行一次覆盖重写即可
    @Override
    public void abs() {
        System.out.println("覆盖重写了两个接口的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对冲突的Explain和ExplainA的默认方法进行覆盖重写");
    }
}
