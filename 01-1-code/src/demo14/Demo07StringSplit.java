package demo14;
/*
* 分割字符串的方法：
* public String[] split(String regex):按照参数规则，将字符串切割为若干部分。
*
* 注意事项：
* split方法的参数其实是一个"正则表达式"
* 如果需要按照英文句点"."切割，必须使用"\\."
*/
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] strArray1 =  str1.split(",");
        for (int i = 0; i < strArray1.length; i++) {
            System.out.println(strArray1[i]);//aaa bbb ccc
        }

        System.out.println("==============");
        String str2 = "aaa bbb ccc";
        String[] strArray2 =  str2.split(" ");
        for (int i = 0; i < strArray2.length; i++) {
            System.out.println(strArray2[i]);//aaa bbb ccc
        }

        System.out.println("==============");
        String str3 = "aaa.bbb.ccc";
        String[] strArray3 =  str3.split(".");
        String[] strArray4 =  str3.split("\\.");
        System.out.println(str3.length());
        System.out.println(strArray3.length);
        for (int i = 0; i < strArray3.length; i++) {
            System.out.println(strArray3[i]);//0
        }
        for (int i = 0; i < strArray4.length; i++) {
            System.out.println(strArray4[i]);//aaa bbb ccc
        }
    }
}
