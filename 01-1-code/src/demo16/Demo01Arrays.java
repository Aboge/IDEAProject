package demo16;

import java.util.Arrays;

/*
* java.Arrays是一个与数组相关过的工具类，里面提供了大量的静态方法，用来实现数组常见的操作。
*
* public static String tostring(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3，。。。]）
* public static void sort(数组)：按照默认升序（从小到大）对数组元素进行排序。
* 备注：
* 1。如果是数字，sort那么就数字升序排列
* 2。如果是字母，sort按照字母升序排列
* 3。如果是自定义类型，那么这个自定义的类需要Comparble或者Comparator接口的支持
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        String intStr = Arrays.toString(array);//将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3，。。。]）
        System.out.println(intStr);

        int[] array1 = {1,2,4,2,1,0};
        Arrays.sort(array1);//按照默认升序（从小到大）对数组元素进行排序。
        System.out.println(Arrays.toString(array1));//按照字符串输出排序后的结果

        String[] Array = {"abc","aaa","ccc"};
        Arrays.sort(Array);//对字符串进行排序
        System.out.println(Arrays.toString(Array));
    }

}
