package demo29;

public interface MyInterfaceExplainA {
    //抽象方法methodA
    public abstract void methodA();
    public abstract void abs();

    public default void methodDefault(){
        System.out.println("这是ExplainA接口的默认方法！");
    }
}
