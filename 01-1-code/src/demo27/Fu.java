package demo27;

public  abstract class Fu {

    public Fu() {                 //抽象类的构造方法
        System.out.println("父类构造方法执行！");
    }

    public abstract void method();//抽象方法

    public abstract void methodA();//第二个抽象方法
}
