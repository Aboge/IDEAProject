package demo01.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
    java.itcast.jdbc.util.List接口 extends Collection接口
    List接口的特点:
        1.有序的集合,存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引,包含了一些带索引的方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        - public E get(int index):返回集合中指定位置的元素。
        - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
    注意:
        操作索引的时候,一定要防止索引越界异常
        IndexOutOfBoundsException:索引越界异常,集合会报
        ArrayIndexOutOfBoundsException:数组索引越界异常
        StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建也给List集合，多态
        ArrayList<String> list = new ArrayList<>();
        //使用add方法为list集合当中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("e");
        System.out.println(list);//[a, b, c, d, a, e] 重写了toString方法

        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        //在c和d当中添加一个元素it
        list.add(3,"it");
        System.out.println(list);


        //public E get(int index):返回集合中指定位置的元素。
        String remove = list.remove(2);
        System.out.println("被移除的元素" + list);//移除了第2个元素、

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        //把最后也给元素e，替换为E
        String e = list.set(5, "E");
        System.out.println("被替换下来的元素" + e);
        System.out.println(list);

        //public E get(int index):返回集合中指定位置的元素。
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------使用迭代器Interator方法---------");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println("--------使用增强for循环方法---------");
        //使用增强for
        for (String s : list) {
            System.out.println(s);
        }

        //操作索引超出了集合的长度
//        list.get(8);// IndexOutOfBoundsException:索引越界异常,集合会报
    }
}
