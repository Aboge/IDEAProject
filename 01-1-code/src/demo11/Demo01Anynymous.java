package demo11;
/*
* 创建对象的标准格式：
* 类名称 对象名  = new 类名称();
*
*
* 匿名对象构建
*new 类名称().成员方法/成员变量；
* 注意事项：匿名对象只能使用唯一的一次，下次再用不得不创建一个新对象。
* 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
* */
public class Demo01Anynymous {
    public static void main(String[] args) {
//        在创建对象时已经给对象取类名字
        Person person = new Person();
        person.setName("张三");
        System.out.println("我的名字是：" + person.getName());

//        匿名对象
        new Person().setName("李四");


    }

}
