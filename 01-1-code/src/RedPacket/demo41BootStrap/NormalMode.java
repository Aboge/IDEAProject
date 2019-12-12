package RedPacket.demo41BootStrap;

import RedPacket.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount;//平均值
        int mod = totalMoney % totalCount;//零头

        //totaCount - 1代表，最后一个先留着
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }

        //零头放入到最后一个红包当中
        list.add(avg + mod);

        return null;
    }
}
