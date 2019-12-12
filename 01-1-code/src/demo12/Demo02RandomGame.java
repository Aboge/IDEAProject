package demo12;

import java.util.Random;
import java.util.Scanner;

/*
* 题目：
* 用代码模拟猜数字的小游戏：
*
* 思路：
* 1。首先需要产生一个随机数字，并且一旦产生不再变化，用Random的next的方法
* 2。需要键盘输入，所以用到Scanner
* 3。获取键盘输入的数字，用Scanner当中的next方法
* 4。已经得到类两个数字，用（if）判断一下；
*   如果太大了，提示太大，并且重试；
*   如果太小，提示太小，并且重试；
*   如果猜中了，游戏结束
* 5。猜错了重新来一次，循环次数不确定，用while（true）。
* */
public class Demo02RandomGame {
    public static void main(String[] args) {

        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("请输入你猜测的数字：");
            int guessNum = scanner.nextInt();

            if (i == 9){
                System.out.println("你的机会用完了！");
                break;
            }

            if (randomNum < guessNum){
                System.out.println("你输入的数字太大了，请重新输入");
            }else if (randomNum > guessNum){
                System.out.println("你输入的数字太小了，请重新输入");
            }else {
                System.out.println("猜中了！！！");
                break;
            }

        }



        System.out.println("Game Over！");

    }
}
