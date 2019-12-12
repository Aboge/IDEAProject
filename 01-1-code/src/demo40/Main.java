package demo40;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");//设置名称

        //设置技能
        hero.setSkill(new SkillImpl());//使用单独的实现类
        hero.attack();

        System.out.println("-------------------------");

        //还可以使用匿名内部类来作为接口对象的参数
        hero.setSkill(new Skill() {    //同时使用来匿名对象，将new 出来的对象直接作为setSkill的参数传入
            @Override
            public void use() {
                System.out.println("xiuxiuxiu");
            }
        });
        hero.attack();
    }
}
