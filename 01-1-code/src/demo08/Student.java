package demo08;
/*
构造方法是专门用来创建对象的方法，当我门通过关键字new来创建对象，其实就是在调用构造方法。
格式：
public 类名称(参数类型 参数名称){
    方法体；
}

注意事项：
1。构造方法的名称必须与类名称完全一样，大小写也要完全一致。
2。构造方法不需要写返回值，连void都不要写
3.构造方法不能返回一个具体的返回值。
4。在没有编写构造方法时，编译器默认自动生成一个空白的构造方法，没有参数，方法体，什么事情都不作。
public demo09(){}
5.一旦编写类至少一个构造方法，那么编译器将不再赠送。
6.构造方法也是可以进行重载的。
重载：方法名称相同，参数列表不同
* */
public class Student {
//    成员变量
    private String name;
    private int age;

//    无参数的构造方法
    public Student(){
        System.out.println("无参构造方法执行！");
    }
//    有参数的构造方法
    public Student(String name,int age){
        System.out.println("全参构造方法执行！");
        this.name = name;
        this.age = age;
    }

//    Getter和Setter方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
