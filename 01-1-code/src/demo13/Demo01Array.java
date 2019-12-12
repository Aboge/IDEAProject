package demo13;
/*
* 题目：
* 定义一个数组，用来存储3个Person对象。
*
* 数组的缺点：一旦创建，程序运行期间长度不可以发生改变。
* */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("张三",20);
        Person two = new Person("李四",25);
        Person three = new Person("王五",23);

//        将one当的中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());//李四

    }
}
