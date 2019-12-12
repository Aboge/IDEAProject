package demo33;

public class Demo01Main {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        //开机
        computer.powerOn();

        //准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        //首先向上转型为一个USB设备来使用
        USB usbMouse = new Mouse();
        //参数是USB类型的对象，正好传递进去的就是USB类型的对象usbMouse
        computer.useDevice(usbMouse);

        System.out.println("---------------------");

        //创建一个usb键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法!也发生了向上转型，自动实现
//        computer.useDevice(new Keyboard());//也正确


        //关机
        computer.powerOff();

        System.out.println("---------------------");

        method(10.0);//正确写法 double --> double
        method(20);//也是正确的 int --> double，发生了自动转换
        method((double)30);//也是正确的，强制进行转换
    }

    public static void method(double num){
        System.out.println(num);
    }


}
