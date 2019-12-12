package demo39;
/*
* 将类作为成员变量
* */
public class Hero {

    private String name;
    private int age;
    private Weanpon weanpon;//英雄的武器

    public Hero(String name, int age, Weanpon weanpon) {
        this.name = name;
        this.age = age;
        this.weanpon = weanpon;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weanpon getWeanpon() {
        return weanpon;
    }

    public void setWeanpon(Weanpon weanpon) {
        this.weanpon = weanpon;
    }

    public void attack(){
        System.out.println("年龄为" + getAge() + "的" + name + "用" + weanpon.getCode() + "攻击敌人");
    }
}
