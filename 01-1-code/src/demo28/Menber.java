package demo28;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {

    public Menber() {
    }

    public Menber(String name, int money) {
        super(name, money);
    }

    //接收红包的方法，参数是已经放入红包的集合
    public void receive(ArrayList<Integer> list){
        //从多个红包当中随机抽取一个，送给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());//编号的范围是在红包集合的大小范围之内
        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int detla = list.remove(index);
        //当前成员自己本来有多少钱
        int money = super.getMoney();

        //加上得到的新红包的金额，得到最新的余额
        super.setMoney(money + detla);
    }
}
