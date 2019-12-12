package demo28;

import java.util.ArrayList;

//子类
public class Manager extends User{

    public Manager(){
    }

    //调用父类的构造方法，有参构造
    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totaManey,int count){
        //首先需要创建一个集合，原来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();//创建空集合

        //首先看一下群主的金额
        int leftmoney = super.getMoney();
        if (totaManey > leftmoney){
            System.out.println("余额不足");
            return redList;//返回一个空集合
        }

        //扣钱，其实就是重新设置余额
         super.setMoney(leftmoney - totaManey);//设置当前用户的余额

        //发红包，需要将红包平均分为count份
        int avg = totaManey / count;
        int mod = totaManey % count;//均分后剩下的零头

        //分不均的零头将其放入到最后一个红包当中
        //下面将红包一个个的放入到集合redList中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
