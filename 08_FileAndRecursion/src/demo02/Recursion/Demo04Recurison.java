package demo02.Recursion;

import java.io.File;
import java.io.IOException;

/*
    练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
        c:\\abc
        c:\\abc\\abc.txt
        c:\\abc\\abc.java
        c:\\abc\\a
        c:\\abc\\a\\a.jpg
        c:\\abc\\a\\a.java
        c:\\abc\\b
        c:\\abc\\b\\b.java
        c:\\abc\\b\\b.txt
 */
public class Demo04Recurison {
    public static void main(String[] args) throws IOException {

        CreatNewMkdir();//创建文件夹
        CreatNewFile();//创建文件

        File file = new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc");
        getAllFile(file);
    }

    /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        System.out.println("----------"+dir+"-----------");//打印被遍历的目录名称
        File[] files = dir.listFiles();
        for (File f : files) {
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if(f.isDirectory()){
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            }else{
                //f是一个文件,直接打印即可
                System.out.println(f);
            }
        }
    }

    public static void CreatNewMkdir(){
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc").mkdirs();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/a").mkdirs();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/b").mkdirs();
    }
    public static void CreatNewFile() throws IOException {
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/abc.txt").createNewFile();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/abc.java").createNewFile();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/a/abc.jpg").createNewFile();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/a/abc.java").createNewFile();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/b/b.java").createNewFile();
        new File("/Users/aboge/IDEAProject/08_FileAndRecursion/src/demo02/abc/b/b.txt").createNewFile();
    }
}
