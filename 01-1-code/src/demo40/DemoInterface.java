package demo40;

import java.util.ArrayList;
import java.util.List;

/*
* java.itcast.jdbc.util.List正是Arraylist所实现的接口名称
*
* 接口可以作为方法的返回值类型，也可作为方法的参数
* */
public class DemoInterface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    //返回值类型为list集合类型，参数也是list类型
    public static List<String> addNames(List<String> list){
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        return list;
    }
}
