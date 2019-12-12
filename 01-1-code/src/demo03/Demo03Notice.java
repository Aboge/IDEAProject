package demo03;
/*
* 使用方法的时候，注意事项：
* 1。方法应该定义在类中，但是不能在方法当中再定义方法，不能嵌套。
* 2。方法定义的顺序前后无所谓。
* 3。方法定义之后不会执行，如果希望执行，一定要调用；单独调用、打印调用、赋值调用。
* 4。如果方法有返回值，那么必须写上"return 返回值；"不能没有。
* 5。return后面的放回值数据，必须和方法的返回值类型对应起来。
* 6。对于一个void没有返回值的方法，不能return后面的返回值，只能写return自己：return；。
* 7。对于void方法当中最后一行的return可以忽略不写。
* 8。一个方法当中可以有多个retunr语句，但是必须保证同时只能一个语句可以执行,两个rturn不能连写。
* */
public class Demo03Notice {
    public static int method01(){
        return 1; //int类型的方法必须有int类型的返回值；
    }

    public static void method02(){
        System.out.println("AAA");
//        return;   //void类型没有返回值，可以忽略不写。
    }

    public static int max(int a,int b){
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println(max(10,20));
    }
}



