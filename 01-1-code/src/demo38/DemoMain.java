package demo38;
/*
* 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
* 那么这种情况下就可以省略该类的定义，二改为使用【匿名内部类】。
*
* 匿名内部类的定义格式：
* 接口名称 对象名称 = new 接口名称(){
*       @Override
*       //覆盖重写接口的抽象方法；
* };
*
* 对格式进行解析"new 接口名称（）{ ...}"
* 1.new 代表创建对象的当作
* 2。接口名称就是匿名内部类需要实现哪个接口
* 3。{...}这才是匿名内部类的内容
*
* 另外还要注意几点问题：
* 1。匿名内部类：在【创建对象】的时候，只能使用唯一一次。
* 如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
*
* 2.匿名对象，在【调用方法】的时候，只能使用唯一的一次。
* 如果希望同一个对象，调用多次方法，那么必须给对象起名字
*
* 3。匿名内部类是省略了【实现类/子类的名称】，但是匿名对象是省略了【对象名称】
* 强调：匿名内部类和匿名对象不是一回事！！！！
* */
public class DemoMain {
    public static void main(String[] args) {
        MyInnerface impl = new MyInnerfaceImpl();//多态，编译看左，运行看右
        impl.method();


        System.out.println("-------------------");

//        MyInnerface impl1 = new MyInnerface();//错误

        MyInnerface impl1 = new MyInnerface() {
            @Override
            public MyInnerface method() {
                System.out.println("匿名内部类实现了方法1111AAA");
                return null;
            }

            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法22222AAA");
            }
        };
        impl1.method();
        impl1.method1();


        System.out.println("-------------------");

        MyInnerface impl2 = new MyInnerface() {//一个匿名内部类new只能使用唯一一次
            @Override
            public MyInnerface method() {
                System.out.println("匿名内部类实现了方法3333BBBB");
                return null;
            }

            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法4444BBBB");
            }
        }.method();//将匿名对象中的方法的返回值作为值传递给新的对象

        System.out.println(impl2);//null


        System.out.println("-------------------");

        new MyInnerface() {//一个匿名内部类new只能使用唯一一次
            @Override
            public MyInnerface method() {
                System.out.println("匿名内部类实现了方法3333BBBB");
                return null;
            }

            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法4444BBBB");
            }
        }.method();//将匿名对象中的方法的返回值作为值传递给新的对象

        System.out.println(impl2);//null
    }
}
