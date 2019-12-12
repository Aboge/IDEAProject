package demo16;

import java.util.Arrays;

/*
* 请使用Arrays相关的API，将一个随机字符串的所有字符肾虚排列，并倒序打印出来
*
* */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "ervweuirvwueviwneu72323fwvwe";

        //如何进行升序排列：sort
        //必须是一个数组才能用啊Arrays.sort方法
        //String-->数组，用toCharArray
        char[] chars = str.toCharArray();//将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3，。。。]）
        Arrays.sort(chars);//将数组进行升序排列

        //需要进行逆序遍历
        for (int i = chars.length - 1; i >= 0; i--) {  //chars.forr
            System.out.print(chars[i]);
        }


    }
}
