package demo29;

public class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public void methodAbs1() {
        System.out.println("实现了抽象方法，AAA");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类A覆盖重写接口类default方法");//覆盖重写后改变接口的默认方法体
    }
}
