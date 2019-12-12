package demo27;

public class Zi extends Fu { //快速显示错误提示：option + enter


    public Zi() {
        //super();//赠送，初始化父类成员
        System.out.println("创建子类构造对象！");
    }

    //必须覆盖重写父类所有的抽象方法
    @Override
    public void method() {
        System.out.println("吃饭");
    }

    @Override
    public void methodA() {

    }
}
