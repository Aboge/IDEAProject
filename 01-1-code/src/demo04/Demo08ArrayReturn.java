package demo04;
/*
* 一个方法可以有0、1或多个参数，但是只能有0或者1个返回值，不能返回多个值。
* 如果希望一个方法中产生多个结果数据需要进行返回，怎么办？
* 解决办法，使用一个数组作为返回值类型即可。
*
* 任何数据类型都可以作为方法的参数类型，或者返回值类型。
* 数组作为方法的参数，传递进去的其实是数组的地址值。
* 数组作为方法的返回值，返回的其实也是数组的地址。
* */
public class Demo08ArrayReturn {
    public static void main(String[] args) {
        int a = 3,b = 4,c =2;
        int[] result= calculate(a,b,c);
        System.out.println("总和：" + result[0]);
        System.out.println("平均：" + result[1]);

    }
//    返回值类型为数组类型，因此方法的定义的返回值类型为int[]
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;
        //两个结果都希望进行返回
        //需要一个数组，数组可以保存多个结果进行返回。

        /*int[] Array = new int[2];
        Array[0] = sum;
        Array[1] = avg;*/

        int[] Array = {sum, avg};

        return Array;//返回数组的地址
    }
}
