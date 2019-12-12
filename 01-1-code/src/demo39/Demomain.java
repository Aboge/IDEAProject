package demo39;

public class Demomain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        //唯一英雄取名字
        hero.setName("盖伦");
        hero.setAge(20);

        //创建一个武器
        Weanpon weanpon = new Weanpon("多兰剑");
        //为英雄配备武器
        hero.setWeanpon(weanpon);//将weapon对象作为参数传递给hero方法

        hero.attack();
    }
}
