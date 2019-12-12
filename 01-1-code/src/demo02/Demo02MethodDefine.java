package demo02;
/*
* 方法就是若干语句的功能集合。
* 方法好比就是一个工厂：
    * 蒙牛工厂  原料：奶牛、饲料、水
    *          产出物：奶制品
* 参数（原料）：就是进入方法的数据。
* 返回值（产出物）：就是冲方法中出来的数据。
*
* 定义方法的完整格式：
* 修饰符 返回值类型 方法名称（参数类型 参数名称，、、、）{
*   方法体
*   return 返回值；
* }
* 修饰符：现阶段的固定手法，public static
* 返回值类型：也就是方法最终产生的数据是什么类型
* 方法名称：方法的名字。规则和变量一样，小驼峰
* 参数类型：进入方法的数据是什么类型
* 参数名称：进入方法的数据对应的变量名称
* PS：参数如果有多个，用逗号隔开。
* 方法体：方法需要做的事情，若干行代码
* return：两个作用，第一停止当前方法，第二将后面的返回值返还给调用处
* 返回值：也就是方法执行后最终产生的数据结果
*
* 注意：return后面的"返回值"，必须和方法前面的"返回值类型"，保持对应。
*
* 定义一个两个int数字想加的方法，三要素：
* 返回值类型：int
* 方法名称：sum
* 参数列表：int a,int b;
*  */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }
    public static int sum(int a,int b){
        int result = a + b;
        return result;
    }
}
