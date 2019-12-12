package demo35;

public class MyClass {

    private int num = 10;
    int num1 = 20;
    protected int num2 = 30;
    public int num3 = 40;


    public void method01(){
        System.out.println(num);//可以访问本类的private类型变量
        System.out.println(num1);
        System.out.println(num2);
    }
}
