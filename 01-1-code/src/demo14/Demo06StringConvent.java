package demo14;
/*
* String当中与转换相关的常用方法
*
* public char[] toCharArray(); 将当前字符串拆分为字符数组作为返回值。
* public byte[] getBytes():获得当前字符串底层的字节数组(阿斯克码)。
* public String replace(CharSequence oldString,CharSequence newString):
* 将所有出现的辣字符串替换为新的字符串，返回替换之后的结果新字符串。
* 备注：CharSequence意思就是说可以接收字符串类型
* */
public class Demo06StringConvent {
    public static void main(String[] args) {
        char[] chars =  "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("===========");
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);//97 98 99
        }

        System.out.println("===========");
        String str = "How do you do?";
        String str1 = str.replace("o","e");
        System.out.println(str);//原来的不会发生改变
        System.out.println(str1);//改变后的是生成的新字符串

        System.out.println("===========");
        String lang1 = "你太烂了！";
        String lang2 = lang1.replace("太烂","**");
        System.out.println(lang2);

    }
}
