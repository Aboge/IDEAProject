package demo29;
/*
* 接口当中也可以定义"成员变量"，但是必须使用public static final三个关键字进行修饰。
* 从效果上看，这其实就是接口的【常量】
* 格式：
* public static final 数据类型 常量名称 = 数据值；
*
* 注意：
* 一旦使用final关键字进行修饰，那么就说明不能变了。
*
* 注意事项：
* 1。接口当中的常量，可以省略public static final ,注意：不写也是这三个关键字修饰。
* 2。接口当中的常量，必须要进行赋值，不能不赋值。
* 3.接口中的常量的名称，使用完全大写的字母，用下划线进行分隔
*
* 可以通过直接访问接口.常量名称来直接读取使用接口常量。
* */
public interface MyInterfaceConst {

    //这其实就是一个常量，一旦赋值就不能修改，且必须进行赋值
    public static final int NUM_OF_CLASS = 10;
    int num1 = 20;//也是被赋值的常量，不能改变

}
