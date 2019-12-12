package demo06;
//两个对象引用指向同一个对象空间

public class IphoneX {
    public static void main(String[] args) {

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

        System.out.println("--------------------------------");

        //当直接从前面的对象中直接接用生成的对象，直接被前面对象进行赋值
        Phone iphonex = iphone;

        System.out.println(iphonex.brand);//APPLE
        System.out.println(iphonex.color);//RED
        System.out.println(iphonex.price);//5000

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
