package demo15;

public class Student {

    private int id;
    private String name;
    private int age;
    static String room;//所在教室，为static类型
    private static int idCounter = 0;//学号计数器，每当new一个新的对象的时候，计数器++


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public Student() {
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
