package demo10;
/*
* 自动导包快捷键：alt + enter
* */

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        System.out.println("请输入两个数字：");

        int a = num1.nextInt();
        int b = num1.nextInt();

        System.out.println("结果是：" + (a + b));


    }
}
