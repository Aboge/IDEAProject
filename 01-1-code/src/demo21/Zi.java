package demo21;

public class Zi extends Fu {

    public Zi(){
//        super();//由编译器默认的，在运行子类构造方法前调用父类无参构造方法
        super(10);//super方法调用父类有参的重载方法
        System.out.println("子类构造方法！");
    }

    public void Zi(){
//        super();//错误！！！只有子类构造方法才能调用父类构造方法
    }

}
