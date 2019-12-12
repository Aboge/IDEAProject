package demo07;

public class Student {

    private String name;
    private int age;
    private boolean male;

    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    //boolean类型Getter方法一定要写成isxxx的形式
    public boolean isMale() {
        return male;
    }
}
