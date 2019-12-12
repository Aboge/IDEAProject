package demo32;
//继承子类

//普通子类在继承父类的时候不需要覆盖所有方法（abstract抽象方法必须要进行覆盖重写），父类的普通成员方法可不进行重写

//子类也可以有自己独有的成员方法
public class Cat extends Animal{

    //覆盖重写父类方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼！");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
