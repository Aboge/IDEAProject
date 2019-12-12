package demo38;

public class MyInnerfaceImpl implements MyInnerface {
    @Override
    public MyInnerface method() {
        System.out.println("实现类覆盖重写了方法11111！");
        return null;
    }

    @Override
    public void method1() {
        System.out.println("实现类覆盖重写了方法2222！");
    }

}
