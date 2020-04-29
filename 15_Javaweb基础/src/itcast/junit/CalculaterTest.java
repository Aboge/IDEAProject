package itcast.junit;

public class CalculaterTest {
    public static void main(String[] args) {
//        创建对象
        Calculator c = new Calculator();
//        调用
/*
        int result = c.add(1,2);
        System.out.println(result);
*/
        int sub = c.sub(3, 4);
        System.out.println(sub);
    }
}
