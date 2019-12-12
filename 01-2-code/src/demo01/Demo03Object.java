package demo01;

import java.util.Objects;

public class Demo03Object {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abc";

//        boolean b = s1.equals(s2);//错误，NullPointerException，null是不能调用方法的，就会抛出空指针异常
//        System.out.println(b);

        /*
        * Object类的equals方法：对两个对象进行比较，防止空指针异常，
            public static boolean equals(Object a,Object b){
                return(a == b) || (a! == null && a.equals(b));
            }
        * */

        //使用Object方法来进行比较的好处就是可以防止发生空指针异常
        boolean c = Objects.equals(s1,s2);
        System.out.println(c);

    }
}
