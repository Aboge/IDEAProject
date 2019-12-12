package demo27;

//子类也是一个抽象类，对父类的抽象方法不完全覆盖重写
public abstract class Zi1 extends Fu {

    @Override
    public void method() {  //对父类抽象方法进行覆盖重写为具体成员方法
        System.out.println("这是抽象子类Zi1对父类Fu进行覆盖重写的方法");
    }

    public abstract void methodA(); //直接覆盖重写父类的抽象方法

}
