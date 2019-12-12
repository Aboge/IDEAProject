package demo12;

import java.util.Random;

/*
* Random类用来生成随机数字，使用三个步骤
* 1。导包
* import java.itcast.jdbc.util.Random;
*
* 2。创建
* Random r = new Random();//小括号留空
*
* 3。使用
* 获取一个随机的int数字（范围是int的所有范围，有正负两种）：int num = r.nextInt();
* 获取一个随机int数字 （参数代表类范围，左闭右开区间）：int num = r.nextInt(3);
* 实际代表含义是：[0,3),也就是0～2
* */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);

        Random r1 = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println("第" + i + "个随机数字是：" + r1.nextInt(10));
        }
    }
}
