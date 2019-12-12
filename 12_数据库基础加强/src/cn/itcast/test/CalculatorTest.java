package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
* Junit使用：白盒测试
* 步骤：
*   1。定义一个测试类（测试用例）
*       建议：
*           测试类名：被测试的类名Test         calculatorTest
*           包名：xxx.xxx.xx.test           cn.itcast.test
*   2.定义测试方法：可以独立运行
*       建议：
*           方法名；test测试的方法名称         testAdd（）
*           返回值：void无返回值
*           参数列表：空参数
*
*   3。给方法加@Test
*   4。导入junit环境
*
* 判断结果：
*       红色：失败
*       绿色：成功
*       用断言方法来进行判断：
*           Assert.assertEqualsv（断言结果，result实际结果）
* */

public class CalculatorTest {
/**
     * 初始化方法：
     *  用于资源申请，所有测试方法在执行之前都会先执行该方法
     */

    @Before     //确保在所有的方法执行前执行该方法
    public void init(){
        System.out.println("init...");
    }

/**
     * 释放资源方法：
     *  在所有测试方法执行完后，都会自动执行该方法
     */

    @After
    public void close(){
        System.out.println("close...");
    }




/**
     * 测试add方法
     */

    @Test
    public void testAdd(){
       // System.out.println("我被执行了");
        //1.创建计算器对象
        System.out.println("testAdd...");
        Calculator c  = new Calculator();
        //2.调用add方法
        int result = c.add(1, 2);
        //System.out.println(result);

        //3.Assert断言  我断言这个结果是3 断言结果与真正的计算结果对比
        Assert.assertEquals(3,result);

    }

    @Test
    public void testSub(){
        //1.创建计算器对象
        Calculator c  = new Calculator();
        int result = c.sub(1, 2);
        System.out.println("testSub....");
        Assert.assertEquals(-1,result);
    }
}

