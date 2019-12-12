package RedPacket.demo41BootStrap;

import RedPacket.red.OpenMode;

/*
* 场景说明：
*   红包发出去后，所有的人都有红包，大家抢完以后，最后也给红包给群主
*
* 我们的自己的操作：
*   1。设置一下程序的标题，通过构造方法的字符串参数
*   2。设置分发策略，平均，还是随机？
*
* 红包分发的策略：
*   1。普通红包（平均）：totalMoney / totalCount，余数放在最后一个红包当中。
*   2。手气红包（随机）：最少1分钱，最多不超过平均数的2倍，应该越发越少。
*
*
* */
public class DootStrap {
    public static void main(String[] args) {
        MyRed red = new RedPacket.demo41BootStrap.MyRed("红包");

        //设置群主名称
        red.setOwnerName("王思聪");

        //设置分发策略
        OpenMode normal = new NormalMode();
        red.setOpenWay(normal);

    }
}
