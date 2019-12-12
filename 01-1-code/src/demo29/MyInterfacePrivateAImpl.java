package demo29;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother(){

        //可以直接方法问到接口当中的Common方法，实际上是不应该被实现类访问到的
        //methodCommon();
    }
}
