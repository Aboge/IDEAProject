package demo30;

public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    //该接口当中一共有四个抽象方法
    /*
    * methodA 来源于MyInterfaceA
    * methodB 来源于MyInterfaceB
    * comment 来源于MyInterfaceA和MyInterfaceB
    * method  来源于自己的方法
    * */
    public abstract void method();


    //对父接口当中重复的默认方法，需要进行覆盖重写
    @Override
    public default void methodDefult() {

    }
}
