package demo19;
/*
* 方法覆盖重写的注意事项：
* 1。必须要保证父子类之间的名称相同，参数列表也相同。
* @Override   //覆盖重写的注释标志，检测当前的方法是否是覆盖重写
*
* 2.子类方法的返回值必须小于等于父类方法的返回值范围
* 小扩展：java.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类
*
* 3.子类方法的权限必须【大于等于】父类方法的权限修饰符,绝大数情况都是相同的
* 小扩展：public > protected > (default) > private
* 备注：（default）不是关键字default，而是什么都不写，留空
* */
public class Demo01Override {
    public static void main(String[] args) {

    }
}