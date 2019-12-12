package demo36;

public class Body { //外部类

    public class Heart { //  成员内部类

        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动！");
            System.out.println("我叫" + name);//可以直接访问外部类的变量，方法
        }

    }

    private String name;

    //外部类的方法
    public void methodOut(){
        System.out.println("这是外部类的成员方法！");
        /*Heart heart = new Heart();
        heart.beat();*/
        new Heart().beat();//外部类的对象来访问内部类的方法
    }

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
