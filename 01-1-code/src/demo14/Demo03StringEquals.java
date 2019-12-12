package demo14;



/*
* == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
*
* public boolean equals(Object obj):参数可以是任何对象，只有参数是一个【字符串】并且内容相同的才给true；
* 否则返回false
*
* 备注：任何对象都能用Object进行接收
*
* 注意事项：
* 1。任何对象都可以用Object进行接收
* 2。equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
* 3。如果比较双方一个常量一个变量，推荐把常量字符串写在前面
* 推荐："abc".equals(str1)  不推荐str1.equals("abc")  把常量写在前面
*
* public boolean equalsIgnoreCase(String Object):忽略大小写进行比较
* */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true

        String str4 = "hello";
        System.out.println(str4.equals(str1));//false

        String str5 = null;
        System.out.println("abc".equals(str5));//false
        //System.out.println(str5.equals("abc"));//报错，空指针异常NullPointerException

        System.out.println("==============");

        String stra = "Hello";
        String strb = "hello";
        System.out.println(stra.equals(strb));//false
        System.out.println(stra.equalsIgnoreCase(strb));//true 忽略大小写对比

    }
}
