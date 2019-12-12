package demo32;
/*
* 1。对象的向上转型，其实就是多态写法：
* 格式：父类名称 对象名 = new 子类名称；               Animal animal = new Cat();
* 含义：右侧创建一个子类对象，把它当作父类来对待使用。    创建了一只猫，把它当作动物对待，没问题。
* 注意事项：向上转型一定是安全的，从小范围转向大范围，从小范围猫，向上转为大范围的动物。但是也有一个弊端
* 对象一旦转型为父类，那么就无法调用子类原特有的方法。
*
* 类似：
* double num = 100;//正确，int --> double ,自动类型转换。
*
*
* 2。对象的向下转型，其实就是一个【还原】的动作
* 格式：子类名称 对象名 = （子类名称）父类对象；
* 含义：将父类对象，【还原】为本来的子类对象。
* a。必须保证对象本来创建的时候，就是猫，才能向下转型为猫
* b。如果对象创建的时候本来不是猫，不能向下转型为猫，否则报错
*
* 类似：
* int num = (int) 10.0;//可以     int num = (int)10.5//不可以，精度损失
* */
public class Demo01Main {
    public static void main(String[] args) {

        //对象的向上转型，就是：父类引用指向子类对象。
        Animal animal = new Cat();//本来是cat，向上转型为animal父类的对象
        animal.eat();//编译看左，运行看右

        //已经转型为父类对象，不能访问子类特有的方法
        //animal.catchMouse();//错误写法

        //还原为本来的子类对象
        Cat cat = (Cat)animal;//原本的Cat类型的animal转型为Animal类型，现向下转型还原为Cat
        cat.catchMouse();//向下转型还原成功，可以访问Cat子类独有的方法

        //错误转型
        //本来是猫，向上转型后变成animal，现在向下转型为Dog类型，并非原来类型，错误
        //错误写法，编译不会报错，运行有错误：java.lang.ClassCastException
        //Dog dog = (Dog) animal;

    }
}
