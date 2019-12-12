package demo01;

import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。

    注意：无论是相对路径还是绝对路径的判断，都必须是精确目录，精确到文件所在的目录，
    相对路径的是相对当前的工程文件的根目录，getAbsolutePath()方法根据文件获取地址时的觉也只能获取当前文件所在的根目录，
    要想直接访问，还需要精确到文件所在的子目录
 */
public class Demo04File {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    /*
        public boolean isDirectory() ：此File表示的是否为目录。
            用于判断构造方法中给定的路径是否以文件夹结尾
                是:true
                否:false
        public boolean isFile() ：此File表示的是否为文件。
            用于判断构造方法中给定的路径是否以文件结尾
                是:true
                否:false
        注意:
            电脑的硬盘中只有文件/文件夹,两个方法是互斥
            这两个方法使用前提,路径必须是存在的,否则都返回false
     */
    private static void show02() {
        File f1 = new File("/Users/aboge/IDEAProject/08_FileAndRecursion/123");
        System.out.println(f1);

        //先判断是否存在，不存在,就没有必要获取
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("/Users/aboge/IDEAProject/08_FileAndRecursion");
        if(f2.exists()){
            System.out.println(f2.isDirectory());//true
            System.out.println(f2.isFile());//false
        }

        File f3 = new File("/Users/aboge/IDEAProject/08_FileAndRecursion/1.txt");
        if(f3.exists()){
            System.out.println(f3.isDirectory());//false
            System.out.println(f3.isFile());//true
        }
    }

    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在:true
            不存在:false
     */
    private static void show01() {
        File f1 = new File("/Users/aboge/IDEAProject/08_FileAndRecursion/1.txt");
        System.out.println(f1.exists());//true

        File f21 = new File("1.txt");
        System.out.println(f21.getPath());//1.txt
        System.out.println(f21.getAbsolutePath());// /Users/aboge/IDEAProject/1.txt
        File f2 = new File("/Users/aboge/IDEAProject/1.txt");
        System.out.println(f2.exists());//false ,绝对路径必须要深入到当前问价所在的文件夹路径

        File f3 = new File("/Users/aboge/IDEAProject/08_FileAndRecursion");
        System.out.println(f3.exists());//true  可以判断文件夹是否存在

        File f4 = new File("1.txt");
        System.out.println(f4.exists());//false

        File f5 = new File("08_FileAndRecursion/1.txt");
        System.out.println(f5.exists());//true  必须是相对于根目录下的精确目录
    }
}
