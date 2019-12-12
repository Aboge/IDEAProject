package demo13;

import java.util.ArrayList;
import java.util.Random;

/*
* ArrayList作为方法的返回值
* 题目：
* 用一个大集合存入20哥随机数字，然后筛选其中的偶数元素，放到小集合当中
* 要求使用自定义的方法来筛选。
*
* 分析：
* 1.需要创建一个大集合，用来存储int数字：<Integer>
* 2.随机数字就要用到Random NextInt
* 3.循环20次，把随机数字放入到大集合：for循环、add方法
* 4.定义一个方法，用来进行筛选
* 筛选：根据大集合，筛选符合要求的元素，得到小集合
* 三要素：
* 返回值类型：ArrayList小集合（里面元素个数不确定）
* 方法名称：getSmallList
* 参数列表：ArrayList大集合（装着20个随机数字）
*
* 5.判断（if）是偶数：num%2 == 0
* 6.如果是偶数，放到小集合中，否则不放。
* */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            biglist.add(num);
        }
//        打印大集合里面的数字
        System.out.println(biglist);

        /*用新建的ArrayList集合类型的smalllist来接收返回值（ArrayList集合类型）*/
        /*返回值是集合的地址值*/
        ArrayList<Integer> smalllist = getSmallList(biglist);

//        打印小集合里面的偶数集合
        System.out.println(smalllist);
        System.out.println("偶数总共有" + smalllist.size() + "个");
    }

    //这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> biglist){
        //创建一个小集合，用来存放偶数结果
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2 == 0){
                smalllist.add(num);
            }
        }

        return smalllist;
    }
}
