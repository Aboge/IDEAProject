package demo31;

public class Zi extends Fu{

    int num = 30;
    int age = 50;

    @Override
    public void method(){
        System.out.println("这是子类！");
    }

    public void methodZi(){
        System.out.println("这是子类的特有对象！");
    }
}
