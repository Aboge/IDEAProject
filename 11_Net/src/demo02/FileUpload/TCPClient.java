package demo02.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    文件上传案例的客户端:读取本地文件,上传到服务器,读取服务器回写的数据

TCP文件上传案例：
    原理：客户端读取本地的文件，把文件上传到服务器，服务器再把上传的文件保存到服务器的硬盘上

    1。客户端使用本地的字节输入流，读取上传的文件
    2。客户端使用网络字节输出流，把读取的文件上传到服务器端
    3。服务器使用网络字节输入流，读取客户端上传的文件
    4。服务器客使用本地字节输出流，把读取的文件保存到服务器的硬盘上
    5。服务器使用网络字节输出流，给客户端回写一个"上传成功"
    6。客户端使用网络字节输入流，读取服务器回写的数据

    明确:
        数据源:/Users/aboge/IDEAProject/11_Net/1.jpg
        目的地:服务器

    实现步骤:
        1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
        3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
        4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
        6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        8.释放资源(FileInputStream,Socket)
 */
public class TCPClient {
    public static void main(String[] args) throws IOException{
        //1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream file = new FileInputStream("/Users/aboge/IDEAProject/11_Net/1.jpg");
        //2.创建一个客户端Socket对象,构造方法中绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
        int len = 0;
        byte[] bytes = new byte[1024];
        //while循环保证了在读取本地文件的时候不会读取到"-1"标志，因此在传递输出字节流给服务器端的时候也不会把"-1"标志符传递给服务器端
        while ((len = file.read(bytes)) != -1){
            //5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
            os.write(bytes,0,len);
        }

        /*
            问题：while循环中的字符输出流无法传出"-1"标志符，因此无法结束while循环
            解决:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();


        //6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
        //同理，由于服务器端无法回传数据，因此客户端无法接收到结束标志符，while循环也会进入到死循环状态
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }


        //8.释放资源(FileInputStream,Socket)
        file.close();
        socket.close();

    }
}
