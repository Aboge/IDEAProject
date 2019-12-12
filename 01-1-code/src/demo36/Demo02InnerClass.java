package demo36;

public class Demo02InnerClass {
    public static void main(String[] args) {
        //外部类名.内部类 对象名 = new 外部类（）.new 内部类（）;
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
