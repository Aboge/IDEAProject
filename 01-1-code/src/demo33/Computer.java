package demo33;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本开机！");
    }
    public void powerOff(){
        System.out.println("笔记本关机！");
    }

    //使用usb设备的方法，使用接口作为参数
    public void useDevice(USB usb){
        usb.open();//打开设备

        //判断传入的对象的类型，向下转型，按照其类型运行其特有的方法
        if(usb instanceof Mouse){
            ((Mouse) usb).clickMouse();
        }else if (usb instanceof Keyboard){
//            ((Keyboard) usb).type();
            Keyboard keyboard = (Keyboard)usb;//先向下转型
            keyboard.type();//再运行方法
        }

        usb.close();//关闭设备
    }

}
