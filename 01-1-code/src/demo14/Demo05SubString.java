package demo14;
/*
* 字符串的截取：
*
* public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
* public String substring(int begin,int end):截取从begin到end之间的字符串
* 备注：[begin，end)包含左边，不包含右边
* */
public class Demo05SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(3);
        System.out.println(str1);//HelloWorld 原封不动
        System.out.println(str2);//loWorld  新生成的

        String str3 = str1.substring(4, 7);
        System.out.println(str3);

        System.out.println("=================");

        /*
        * 下面的写法中，字符串的内容依然没有变
        * 在堆中存放了两个字符串"Hello"、"Java"
        * strA当中保存的是字符串的地址值
        * 在重新赋值后改变的是strA中存放的地址值
        * */
        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java
    }
}
