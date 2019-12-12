package demo20;

public class NewPhone extends Phone{

    @Override
    public void show(){
        //System.out.println("显示号码");
        super.show();//将父类的show（）方法拿来重复利用
        //子类添加更多的功能
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
