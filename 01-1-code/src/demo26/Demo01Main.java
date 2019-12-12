package demo26;

public class Demo01Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();//不能直接创建抽象类的对象

        /*Animal animal = new Animal() {
            @Override
            public void eat() {

            }
        }*/

        Cat cat = new Cat();
        cat.eat();
        //可以直接调用继承自抽象父类的普通成员方法
        cat.normalMethod();
    }
}
