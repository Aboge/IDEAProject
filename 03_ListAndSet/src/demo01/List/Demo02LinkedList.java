package demo01.List;

/*
    java.itcast.jdbc.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
    }


    /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

    * */
    private static void show01() {
        //创建Linklist集合对象
        LinkedList<String> links = new LinkedList<>();
        //使用add方法添加元素
        links.add("a");
        links.add("b");
        links.add("c");
        links.add("d");
        System.out.println(links);

        //public void addFirst(E e):将指定元素插入此列表的开头。
        links.addFirst("m");//往开头添加元素
        System.out.println(links);
        //public void push(E e):将元素推入此列表所表示的堆栈。
        links.push("www");//都是往开头添加元素
        System.out.println(links);
        //public void addLast(E e):将指定元素添加到此列表的结尾。
        links.addLast("mmm");
        System.out.println(links);

        /*
        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。
        * */
        String first = links.getFirst();
        System.out.println(first);
        String last = links.getLast();
        System.out.println(last);

//        links.clear();//清空链表元素
//        System.out.println(links);

        // - public boolean isEmpty()：如果列表不包含元素，则返回true。
        boolean empty = links.isEmpty();
        System.out.println(empty);//清空后链表为空，返回true


        /*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。
        */
        String s = links.removeFirst();
        System.out.println(links);
        String s1 = links.removeLast();
        System.out.println(s1);
        String pop = links.pop();
        System.out.println(pop);

        System.out.println(links);
    }
}
