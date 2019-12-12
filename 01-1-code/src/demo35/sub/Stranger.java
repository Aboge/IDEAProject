package demo35.sub;

import demo35.MyClass;

public class Stranger {
    public void methodStranger(){
//        System.out.println(num2);//protected不能
//        System.out.println(num);//private不能访问
//        System.out.println(num1);//default不能访问
        System.out.println(new MyClass().num3);//public能
    }
}
