package demo13;
/*
* 如果希望想集合ArrayList当中存储基本类型数据，必须要是有基本类型对应的"包装类"；
*
* 基本类型   包装类（引用类型，包装类都位于java.lang包下）
byte      Byte
* int       Integer     【特殊】
short     Short
long      Long
double    Double
float     Float
* char      Character   【特殊】
boolean   Boolean
*
*
* 从JDK1。5+开始，支持自动装箱，自动开箱
* 自动装箱：基本类型-->包装类型
* 自动拆箱：包装类型-->基本类型
* */
import java.util.ArrayList;

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String > listA = new ArrayList<>();
        //范型只能存储引用类型，也就是只能存储地址，不能具体数值的基本类型
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);

        int num = listB.get(1);
        System.out.println(listB);
    }
}
