package demo27;

public class Sun extends Zi1 {

//    只需要对Zi1父类中的mehtodA抽象方法进行覆盖重写
    @Override
    public void methodA() {
        System.out.println("这是子类Sun对其父类Zi1进行覆盖重写的方法！");
    }
}
