package demo34;
/*
* 当final原来修饰也给方法的时候，这个方法就是最终方法，不能够被覆盖重写
*
* abstract是抽象类的修饰标志符，和final不能共存，其类的方法必须要被覆盖重写
* */
public class Fu {
    public void method(){
        System.out.println("父类方法执行！");
    }
    public final void methodFinal(){
        System.out.println("这是final修饰的父类方法！");
    }
}
