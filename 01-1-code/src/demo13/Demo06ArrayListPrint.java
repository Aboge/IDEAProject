package demo13;

import java.util.ArrayList;

/*
* 题目：
* 定义以指定格式答应集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@隔离每个元素
* 格式参照：{元素@元素@元素}
*
* System.out.println(list);      [10,20,30]
* printArrayList(list);         {10@20@30}
* */
public class Demo06ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);//[张三, 李四, 王五]

        printArrayList(list);

    }

    /*
    * 定义方法的三要素
    * 返回值类型：只是进行打印操作，不需要返回值
    * 方法名称：printArrayList
    * 参数列表：ArrayList
    * */

//    集合list也可以作为方法的参数
    public static void printArrayList(ArrayList<String> list){
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {

            String name = list.get(i);

            if (i == list.size() - 1){
                System.out.println(name + "}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
