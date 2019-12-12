package demo28;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        //创建一个群主
        Manager manager = new Manager("群主",100);
        //创建成员
        Menber one = new Menber("成员A",0);
        Menber two = new Menber("成员B",0);
        Menber tree = new Menber("成员C",0);
        Menber four = new Menber("成员D",0);

        manager.show();
        one.show();
        two.show();
        tree.show();
        four.show();

        System.out.println("-----------------------------");

        //群主一发了30，分成4个红包
        ArrayList<Integer> redlist = manager.send(30,4);//产生的是一个红包集合
        //红包的构成是7、7、7、9
        //三个成员分别收红包
        one.receive(redlist);//从红包集合redlist当中抽自己的红包
        two.receive(redlist);
        tree.receive(redlist);
        four.receive(redlist);

        manager.show();
        one.show();
        two.show();
        tree.show();
        four.show();
    }

}
