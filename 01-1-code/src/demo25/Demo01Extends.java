package demo25;
/*
* Java语言是单继承的。
* 一个类的直接父类只能有唯一个。
*
* class A{}
* class B extends A{}//错误
* class C extends A,B{}//错误
*
* Java语言可以多级继承。
* class A{}
* class B extends A{}//正确，A是B的直接父类
* class C extends B{}//正确，B是A的直接父类，A是C的间接父类
* 注：java.lang.Object是最高级的父类，其没有父类
*
* 一个子类的直接父类是唯一的，但是一个父类可以拥有很多子类。
* class A{}
* class B extends A{}//正确，A是B的直接父类
* class C extends A{}//正确，A也是C的直接父类
*
* */
public class Demo01Extends {
}
