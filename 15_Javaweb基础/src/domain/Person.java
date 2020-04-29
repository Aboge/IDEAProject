package domain;

public class Person {
    public int age;
    private String name;

    public String a;
    protected String b;
    String c;
    private String d;



    public Person() {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("吃东西");
    }
    public void eat(String a){
        System.out.println(a);
    }

    private void love(){
        System.out.println("爱人");
    }
}
