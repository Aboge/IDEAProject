package demo13;

import java.util.ArrayList;

public class Demo03ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

//        快捷生成代码list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
