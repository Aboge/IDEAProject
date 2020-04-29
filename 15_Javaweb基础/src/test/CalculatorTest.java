package test;

import itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * 定义测试方法：可以独立运行
 * 建议：
 * 方法名：test测试的方法名		testAdd()
 * 返回值：void
 * 参数列表：空参
* */
public class CalculatorTest {
    /*
    * 初始化方法：
    * 用于资源申请，所有的测试方法在执行之前都会先执行该方法
    * */
    @Before
    public void init(){
        System.out.println("init....");
    }

    /*
    * 释放资源方法：
    * 在所有的测试方法执行完后，都会自动执行该方法
    * */
    @After
    public void close(){
        System.out.println("close...");
    }


    /*
    * 测试add的方法
    * */
    @Test
    public void testAdd(){
//        System.out.println("我被执行了！");
        //1.创建计算器对象方法
        Calculator c = new Calculator();

        //2.调用add方法
        int result = c.add(1,2);
//        int i = 1/0;  测试程序的结果是红色，测试异常，不通过

        //3.断言，我断言测试的结果是3
        Assert.assertEquals(3,result);//Assert对象中的assertEquals方法可以将断言结果与测试得出的结果进行比对
    }

    @Test
    public void testsub(){
        Calculator c = new Calculator();
        //Assert断言结果比对
        int sub = c.sub(3, 2);
        System.out.println("testSub...");
        Assert.assertEquals(1,sub);
    }


}
