package demo04;
/*
* 题目要求：
* 比较两个数据是否相等。
* 参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型。
* 并在main方法中测试。
* */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a =10,b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)20,(short)20));//强制将int类型参数转化为short类型
        System.out.println(isSame(30,21));

    }

    public static boolean isSame(byte a,byte b){
        System.out.println("两个byte类型的比较结果");
        boolean same;
        if (a == b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("两个int类型的比较结果");
        boolean same = a == b ? true : false;
        return same;
    }

    public  static boolean isSame(short a,short b){
        System.out.println("两个short类型的比较结果");
        return a == b;
    }
}
