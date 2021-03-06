package demo07;
/*
* 面向对象的三大特征：封装、继承、多态。
*
* 封装性在JAVA中的体现：
* 1。方法就是一种封装
* 2。关键字private也是一种封装
*
* 封装就是将一些细节信息隐藏起来，对于外界不可见。
* */
public class Demo02Method {
    public static void main(String[] args) {

        int[] array = {10,02,20,30,40};
        System.out.println("最大值" + getMax(array));

    }
//找对最大值的方法的封装
    public static int getMax(int[] array){
        int max = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}

