package demo05;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 面向过程：当需要实现一个功能的时候，每一个具体的步骤需要亲力亲为，详细处理每一个细节。
* 面向对象：当需要实现一个功能的时候，不关心具体的功能怎么实现的，而是找一个相应的方法来实现。
* */
public class Demo01PrintArray {
    public static void main(String[] args) {
//    面向过程的思想
        int[] array = {1,2,3,4};
        //要求打印格式为：[1,2,3,4]
        //面向过程的编程，需要亲自实现其中的每一个步骤
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.println(array[i] + "]");
            }else {
                System.out.print(array[i] + " ,");
            }
        }

        System.out.println("==============");
        //使用面向对象的思想
        //找一个JDK给我门提供好的Array类，
        //其中有一个toString方法，直接就能吧数组变成想要的格式字符串
        System.out.println(Arrays.toString(array));
    }

}
