package demo02;



public class Demo01Method {

    //方法定义public static void method(){
    // }
    public static void printmethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");  /*使用print输出结果不会换行*/
            }
            System.out.println();/*使用println输出结果会自动换行*/
        }
    }

    public static void main(String[] args) {
        printmethod();
    }
}
