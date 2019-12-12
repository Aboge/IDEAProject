package demo04;

/*
* 直接打印的数组名称结果是数组的内存地址值
*
* 使用动态数组的时候，在未赋值的时候，数组内的每个元素会赋予默认赋值
* int类型，默认为0
* float类型，默认为0.0
* char类型，默认为'\u0000'
* boole类型，默认为false；
* 引用类型，默认为null；
*
* */
public class Demo04ArryUse {
    public static void main(String[] args) {
        int[] Array = {1,20,3};

        System.out.println(Array);//[I@60e53b93 直接输出的数组名称结果是数组的内存地址值
        System.out.println(Array[1]);

        int num = Array[2];
        System.out.println(num);

        System.out.println("----------------------");
        //动态初始化
        int[] ArrayA = new int[5];
        System.out.println(ArrayA);//[I@60e53b93 直接输出的数组名称结果是数组的内存地址值
        System.out.println(ArrayA[2]);//使用int动态数组的时候，在未赋值的时候，数组内的每个元素回默认赋值为0

        System.out.println("=====================");
        ArrayA[1] = 123;//对动态数组中的数组赋值
        System.out.println(ArrayA[1]);
    }
}
