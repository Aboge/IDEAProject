package demo04;

import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;

/*
* 数组元素反转
* 本来样子{1,2,3,4}
* 反转后{4,3,2,1}
*
* 要求：不能使用新数组，就用原来的数组进行颠倒
*
* 解析：
* 1。数组元素的反转，其实就是对称位置（同步位移）的元素交换。

* * 2。通常遍历数组位置需要两个索引：
* int min = 0;
* int max = array.length - 1;

* * 3.如何交换两个变量的值？
* int a = 10;
* int b = 20;
* 如果是两个水杯，都是满的，如何交换？借助第三个空杯子。
* int temp = a;
* a = b;
* b = temp;

* 4.什么时候应该进行交换
* min < max

* 5.什么时候应该停止交换
* （1）min == max
* （2）min > max
*
* */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] Array = {10,20,30,40};
        //        打印换序前的结果
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

        ArrayReverse(Array);//直接调用相应的方法时，需要将相应的Array数组地址传递给方法

        //        打印换序后的结果
        System.out.println("==========换序后==========");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }

//    在方法中将数组作为形参传递到方法内，需要写明数组的类型，数组的地址
//    数组换序方法：在换序方法中，已经实际调换了数组存放在内存中数据的内容，因此不需要进行返回值
    public static void ArrayReverse(int[] Array){
        for (int min = 0,max = Array.length-1; min < max; min++,max--) {
            int temp = Array[min];
            Array[min] = Array[max];
            Array[max] = temp;
        }

    }
}
