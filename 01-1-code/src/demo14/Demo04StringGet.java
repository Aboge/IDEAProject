package demo14;
/*
* String当中与获取相关的常用方法有：
*
* public int Length():获取字符串中含有的字符个数，拿到字符串长度
* public String concat(String str):将当前字符串和参数字符串拼接成为返回新的字符串
* public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始）
* public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "afqfqerveqveqvqevervrebetbtbtb".length();
        System.out.println("字符串的长度是：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello ,原封不动
        System.out.println(str2);
        System.out.println(str3);//HelloWorld 创建来一个新的字符串

        //charAt(int index) 获取指定索引位置的单个字符
        char ch = "afqfqerveqveqvqevervrebetbtbtb".charAt(3);
        System.out.println("第3号索引位置的字母是：" + ch);//实际上是第i + 1位上的

        System.out.println("================");

        //查找参数字符串在本来字符串当中出现的第一个索引位置
        //如果不在当前的字符串中，返回-1值
        String orignal = "HelloWorldHelloWorld";
        int index = orignal.indexOf("Wor");
        System.out.println("Wor在字符串中的索引位置是：" + index);//5
        System.out.println("abc在字符串中的索引位置是：" + orignal.indexOf("abc"));//-1
    }
}
