package demo30;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void comment();

    //和MyInterfaceA有相同的默认方法methodDefult
    public default void methodDefult(){

    }
}
