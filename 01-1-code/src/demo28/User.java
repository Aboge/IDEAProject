package demo28;

public class User {

    private String name;//姓名
    private int money;//余额，也就当前用户的钱包余额

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

//    展示当前用户一共有多少钱 show方法
    public void show(){
        System.out.println("我叫" + this.name + " 我有" + this.money + "元钱");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
