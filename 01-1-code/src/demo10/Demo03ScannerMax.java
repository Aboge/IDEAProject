package demo10;

import java.util.Scanner;

/*
* 键盘输入三个int数字，求出最大值
*
*
* */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("请输入三个数字：");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        System.out.println("最大值是：" + Max(a,b,c));
    }

    public static int Max(int a,int b,int c){
        /*int Max = a;
        if (Max < b){
            Max = b;
        }
        if (Max < c){
            Max = c;
        }*/

        int temp = a > b ? a : b;
        int Max = temp > c ? temp : c;

        return Max;
    }
}
