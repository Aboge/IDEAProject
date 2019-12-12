package demo13;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

/*
* Arraylist当中常用的方法有：
* public boolean add(E e):向集合当中添加元素，参数类型和范型一致。
*   备注：对于ArrayList集合来说，add添加当作一定成功，所以返回值可用可不用，
*   但是对于其他集合来说，add添加不一定成功
* public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
* public E remove(int index):从集合当中删除元素，参数是索引编号，返回值是被删除的元素
* publci int size(); 获取集合的长度，返回值是集合包含的元素个数。
* */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

//        向集合当中添加元素
          boolean success = list.add("张三");
        System.out.println(list);
        System.out.println("添加的字符串是否成功：" + success);

        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

//        从集合中获取元素，get，索引值从0开始
        String name = list.get(3);
        System.out.println("第3号索引位置是：" + name);

//        从集合当中删除元素：remove。索引值从0开始
        list.remove(2);//删除王五
        System.out.println(list);

//        获取集合的长度，元素的个数
        int size = list.size();
        System.out.println("集合当中还有" + size + "个人");

    }
}
