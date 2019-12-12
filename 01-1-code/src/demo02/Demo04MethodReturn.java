package demo02;
/*
* 题目要求：定义一个方法，用来求出两个数字之和。（你帮我计算，算完后把结果告诉我。）
题目变形：定义一个方法，用来求出两个数字之和。（你帮我计算，算完后直接打印结果，不需要告诉我。）
*
* 注意事项：
* 对于有返回值的方法，可以使用单独调用，打印调用或者赋值调用。
* 但是对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用。
* */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10,20);
        System.out.println("返回值是："+ num);

        //对于void没有返回值的方法，只能单独调用，不能打印或者赋值。
        getSum01(30,40);
    }
    //我是一个方法，我有返回值int，谁调用我我就把结果返回给谁。
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }

    //我是一个void方法，我没有返回值，我不需要将结果返回给任何地方，运行完方法后空手返回原处。
    public static void getSum01(int a,int b){
        int result = a + b;
        System.out.println("返回值是："+ result);
    }
}
