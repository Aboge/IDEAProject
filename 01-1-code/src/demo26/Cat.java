package demo26;

public class Cat extends Animal {

    //覆盖重写父类的抽象方法
    @Override
    public void eat(){
        System.out.println("猫吃鱼！这是覆盖重写的父类的抽象方法");
    }
}
