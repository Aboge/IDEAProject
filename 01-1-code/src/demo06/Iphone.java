package demo06;

public class Iphone {
    public static void main(String[] args) {
        //根据Phone类，创建一个名为iphone的对象
        //格式：类名称 对象名 = new 类名称()；
        Phone iphone = new Phone();

        System.out.println(iphone.brand);//null
        System.out.println(iphone.color);//null
        System.out.println(iphone.price);//0

        System.out.println("===============");

        iphone.brand = "APPLE";
        iphone.price = 5000;
        iphone.color = "RED";

        System.out.println(iphone.brand);//APPLE
        System.out.println(iphone.color);//RED
        System.out.println(iphone.price);//5000

        System.out.println("===============");
        //使用成员方法
        iphone.call("妈妈");
        iphone.sendMassage();
        iphone.goOnline();

        System.out.println("---------------------------------");
        Phone iphonex = new Phone(); //shift + fn + F6实现同时更改所有同名关键字

        System.out.println(iphonex.brand);//null
        System.out.println(iphonex.color);//null
        System.out.println(iphonex.price);//0

        System.out.println("===============");

        iphonex.brand = "APPLEX";
        iphonex.price = 6000;
        iphonex.color = "BLUD";

        System.out.println(iphonex.brand);//APPLEX
        System.out.println(iphonex.color);//BLUD
        System.out.println(iphonex.price);//6000

        System.out.println("===============");
        //使用成员方法
        iphonex.call("爸爸");
        iphonex.sendMassage();
        iphonex.goOnline();
    }
}
