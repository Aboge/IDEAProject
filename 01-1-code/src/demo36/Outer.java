package demo36;
/*
* 如果出现类重名现象，那么格式是：外部类.this.成员变量名
* */
public class Outer {
    int num = 10;

    public class Inner{
        int num = 20;

        public void methodInner(){
            int num = 30;//内部类的成员方法的局部变量
            System.out.println(num);
            System.out.println(this.num);//内部类的成员变量
//            System.out.println(super.num);//并不是继承关系，不能用super
            System.out.println(Outer.this.num);//外部类的成员变量
        }

    }
}
