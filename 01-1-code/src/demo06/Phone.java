package demo06;
/*
* 定义一个类，用来模拟"手机"事物。
*
* 属性：品牌、价格、颜色
* 行为：大电话、发短信、上网
*
* 对应到类当中：
* 成员变量（属性）：
*   String brand；//品牌
*   String price；//价格
*   String color；//颜色
*
* 成员方法（行为）：
*   public void call(String who){}//打电话
*   publci void sendMessage(){}//群发短信
*   public void goOnline(){}//上网
* */
public class Phone {

    //成员变量
    String brand;//品牌
    int price;//价格
    String color;//颜色

    //成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMassage(){
        System.out.println("群发短信");
    }
    public void goOnline(){
        System.out.println("网上冲浪");
    }
}
