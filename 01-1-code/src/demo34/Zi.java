package demo34;

public class Zi extends Fu {
    @Override
    public void method() {
        System.out.println("子类覆盖重写父类的方法");
    }
    //父类的methodFinal方法是final修饰的，不能进行覆盖重写
    /*public void methodFinal(){

    }*/
}
