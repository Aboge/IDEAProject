package demo04;
/*
* 对于功能类似的方法来说，因为参数列表不一样，却要记住那么多不同费方法名称，太麻烦。
* 方法重载（Overload）：多个方法的名称一样，但是参数的列表不一样。
* 好处：只需要记住一个方法的名称，就可以直接使用相应的方法功能
*
* 方法重载与下列因素有关：
* 1。参数的个数不同；
* 2。参数的类型不同；
* 3。参数类型的顺序不同；
*
* 方法重载与下列因素无关：
* 1。与参数的名称无关；
* 2。与方法的返回值类型无关；
* */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));//自动调用两个参数的sum方法
//        System.out.println(sumThree(10,20,30));
//        System.out.println(sumFour(10,20,30,40));
        System.out.println(sum(20,30,40));//自动调用三个参数的sum方法
    }

    public static int sum(int a,int b){
        return a + b;
    }
//    两个double类型的数据计算，返回值为int类型。
    public static int sum(double a,double b){
        return (int) (a + b);
    }
    public static int sum(int a,double b){
        return (int) (a + b);
    }
    /*public static int sumThree(int a,int b,int c){
        return a + b + c;
    }
    public static int sumFour(int a,int b,int c,int d){
        return a + b + c + d;
    }*/
    public static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        return a + b + c + d;
    }


}
