package demo35;

import demo15.Myclass;

public class MyAnthor {
    public void anthodmethod(){
        //同一个包，没有关系的两个类，可以通过新建对象的方式访问其方法
//        System.out.println(new MyClass().num);//错误！不能访问private类型
        System.out.println(new MyClass().num1);//可以访问default
        System.out.println(new MyClass().num2);//可以访问protected
    }
}
