package demo06;
/*
* 对象作为参数传入方法
* 把new的新对象作为方法的参数时，实际上传入的是对象的地址
* */
public class PhoneParam {
    public static void main(String[] args) {

        Phone one = new Phone();//new出的新成员变量one存储在内存的栈中，new Phone（）在堆中
        //对新的的对象one中的成员变量进行赋值是在堆中进行操作的
        one.brand = "苹果";
        one.price = 9888;
        one.color = "Black";

        method(one);//传递进去的就是one对象（Phone类）的地址值，存储在堆当中
    }

    //static普通方法，不需要对象即可直接调用
    public static void method(Phone param){
        System.out.println(param.brand);//苹果
        System.out.println(param.price);//9888
        System.out.println(param.color);//Black
    }
}
