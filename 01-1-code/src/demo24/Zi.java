package demo24;

public class Zi extends Fu {
    int num = 20;

    @Override
    public void method(){      //对父类的方法进行覆盖重写
        super.method();        //调用父类的成员方法
        System.out.println("子类覆盖重写方法！");
    }

    public void show(){
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }
}
