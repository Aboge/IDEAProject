package demo06;
/*
* 对象作为返回值返回
* 返回值其实就是返回对象的地址值
*
* */
public class PhoneReturn {
    public static void main(String[] args) {

        //用一个Phone类型的想对象接收方法的返回值
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    //返回值为Phone类型的方法
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 10000;
        one.color = "Gold";

        return one;//返回的是one对象的地址
    }
}
