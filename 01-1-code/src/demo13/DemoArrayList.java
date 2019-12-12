package demo13;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

/*
* 数组的长度不可改变。
* 但是ArrayList集合的长度可以随意改变。
*
* 对于ArrayList来说，有一个尖括号<E>代表范型。
* 范型：也就是装在集合中的所有元素，全部都是统一的类型。
* 注意：范型只能是引用类型。不能是基本类型。
* 基本类型: 保存的就是基本类型的数据（比如：数字1，字符串‘hello lvya’，布尔值false等）
* 引用类型: 保存的是地址值，这个地址值去指向某个对象。
*
* 注意事项：
* 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
* 如果内容为空，得到的就是[].
* */
public class DemoArrayList {
    public static void main(String[] args) {
//        创建一个ArrayList集合，集合的名称是list，里面装的全是String字符串类型的数据。
//        备注：从JDK1.7+开始，右侧的尖括号内可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

//        想集合当中加入一些数据，需要用到add方法。添加的只能是范型中规定的类型
        list.add("张三");
        System.out.println(list);
        list.add("李四");
        list.add("李五");
        list.add("王六");
        System.out.println(list);//[张三, 李四, 李五, 王六]
    }
}
