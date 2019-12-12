package demo20;
/*
* 继承：继承父类的方法，对象，同时对父类的方法进行覆盖重写
* 设计原则：对于已经投入使用的类，我们尽量不要进行修改，推荐定义一个新的类，
* 来重复利用其中共性内容，并且添加改动新内容
* */
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.sendMassage();
        phone.show();

        System.out.println("===============");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMassage();
        newPhone.show();
    }
}
