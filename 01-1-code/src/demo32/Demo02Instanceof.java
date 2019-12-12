package demo32;
/*
* 如何才能知道一个父类引用的对象，本来是什么子类？
* 格式：
* 对象 instanceof 类型
* 这将会得到也给boolean值的结果，也就是判断当前的对象能不能当作后面类型的实例。
*
* 向下转型一定要进行类型判断：instanceof
* */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();//猫吃鱼

        System.out.println("==============");

        //如果希望调用子类特有的方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        /*if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.Watch();
        }else if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();//猫抓老鼠
        }
        method(new Dog());*/
    }

    //将对象作为参数传入方法当中
    public static void method(Animal animal){
        if (animal instanceof Dog){     //判断对象本来的子类类型
            Dog dog = (Dog)animal;
            dog.Watch();
        }else if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();           //猫抓老鼠
        }
        method(new Dog());
    }
}
