package demo14;
/*
* 字符串常量池：程序当中直接用双引号创建的字符串，就在字符串常量池中。
*
* 对于基本类型来说， == 是对数值进行比较
* 对于引用类型来说， == 是对【地址值】进行比较
* 双引号直接写的字符串在常量池中，new的不在池当中
* */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] chararray = {'a','b','c'};
        String str3 = new String(chararray);

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str2);//false
    }
}
