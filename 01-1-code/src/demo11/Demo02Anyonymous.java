package demo11;

import java.util.Scanner;

public class Demo02Anyonymous {
    public static void main(String[] args) {
       /*
        //普通使用方式
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //匿名对象的方式
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("匿名对象的数字是：" + num1);

       */

       //使用一般写法传入参数
        System.out.println("输入一般对象赋值的数字");
       Scanner sc = new Scanner(System.in);
       methodParam(sc);

       //使用匿名对象进行传参
        System.out.println("输入匿名对象的赋值数字");
        int num = new Scanner(System.in).nextInt();
        methodParam1(num);

        //匿名对象作为返回值
        Scanner sc1 = methodReturn();
        int num1 = sc1.nextInt();
        System.out.println("匿名对象作为返回值是：" + num1);
    }

    public  static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
    }

    public  static void methodParam1(int num){
        System.out.println("匿名对象的赋值数字是：" + num);
    }

    public static Scanner methodReturn(){
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
