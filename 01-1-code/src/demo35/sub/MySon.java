package demo35.sub;

//在不同包，继承父类需要倒入包
import demo35.MyClass;

public class MySon extends MyClass {
    public void methodSon(){
        System.out.println(num2);
//        System.out.println(num);//private不能访问
//        System.out.println(num1);//default不能访问
    }
}
