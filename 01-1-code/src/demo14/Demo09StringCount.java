package demo14;

import java.util.Scanner;

/*
* 键盘输入一个字符，并且统计其中各种字符出现的次数。
* 种类有：大写字母、小写字母、数字、其他
*
* 思路：
* 1。既然用到键盘输入，有scanner
* 2。键盘输入的是字符串 ：String str = sc.next();
* 3。定义四个变量，分别记录四种字符各自出现的次数。
* 4。需要对字符串一个字，一个字检查，String-->char[],方法就是toCharArray():将当前字符串拆分为字符数组作为返回值。
* 5。遍历char[]字符数组，对当前字符的种类进行判断,并且用四个变量进行++操作。
* */
public class Demo09StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scanner.next();//获取键盘输入的字符串

        int countUpper = 0;
        int countLower = 0;
        int countNumer = 0;
        int countother = 0;

        char[] chars = input.toCharArray();//将字符串拆分开存入到chars[]数组当中
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if ('a' <= ch && ch <= 'z'){
                countLower++;
            }else if ('0' <= ch && ch <= '9'){
                countNumer++;
            }else {
                countother++;
            }
        }

        System.out.println("大写字母有：" + countUpper + "个");
        System.out.println("小写字母有：" + countLower + "个");
        System.out.println("数字有：" + countNumer + "个");
        System.out.println("其他：" + countother + "个");


    }
}
