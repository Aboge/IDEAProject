package annotation;

/**
 * 注解javadoc演示
 *
 * @author itcat
 * @version 1.0
 * @since 1.5
 */
public class AnnoDemo1 {


    //输入"/** + enter"自动生成注解
    /**
     * 计算两数的和
     * @param a     整数
     * @param b     整数
     * @return      两数的和
     */
    public int add(int a, int b ){
        return a + b;
    }
}

/*
* 注解：
    * 概念描述：
    * 1。JDK1.5后的新特性
    * 2。说明程序的
    * 3。使用注解：@注解名称
    * 作用分类：
    * 1⃣ 编写文档：通过代码标识的注解生成文档，【生成文档doc文档】
    * 2⃣ 通过代码里的表示符的注解对代码进行分析【使用反射】
    * 3⃣ 通过代码里的标识符的注解让编译器能够实现基本的编译检查【@Override】

* * 注解文档生成的方法：
* 对指定的java文件在终端中使用javadoc命令，在目录中生成相应的文档文件
*
*
* */