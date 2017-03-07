package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyClien extends JFrame{//客户端程序
 /*    public PrintWriter writer = null;
    Socket socket = null;
   //设置窗口
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    //初始化客户端程序
    public  MyClien(String title) {
        super(title);        	//设置窗口名称
        cc = this.getContentPane();// 初始化一个窗口容器，用来放各种控件
        cc.add(ta, "North");//将文本域放在窗体的上部
        cc.add(tf, "South");//将文本框放在窗体的下部
        tf.addActionListener(new ActionListener(){//添加一个行为监听器，当有输入时，会执行下列行为
            public void actionPerformed(ActionEvent e){
                writer.println(tf.getText());//将输入的字打印到
                ta.append(tf.getText() + '\n');
                tf.setText("");
            }
        });
    }
    private void connect(){
        ta.append("try to connect\n");
        try {
            socket = new Socket("192.169.200.1", 8997);
            writer = new PrintWriter(socket.getOutputStream(), true);
            ta.append("connection succeeds\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        MyClien clien = new MyClien("send data to server");
        clien.setBounds(300, 260, 340, 220);
        clien.setVisible(true);
        clien.connect();
    }*/
	
	public static void main(String[] args) {  
        Socket socket = null;  
        InputStream is = null;  
        OutputStream os = null;  
        // 服务器端IP地址  
        String serverIP = "127.0.0.1";  
        // 服务器端端口号  
        int port = 10002;  
        // 发送内容  
        String data = "Hello";  
        try {  
            // 建立连接  
            socket = new Socket(serverIP, port);  
            // 发送数据  
            os = socket.getOutputStream();  
            os.write(data.getBytes());  
            // 接收数据  
            is = socket.getInputStream();  
            byte[] b = new byte[1024];  
            int n = is.read(b);  
            // 输出反馈数据  
            System.out.println("服务器反馈：" + new String(b, 0, n));  
        } catch (Exception e) {  
            e.printStackTrace(); // 打印异常信息  
        } finally {  
            try {  
                // 关闭流和连接  
                is.close();  
                os.close();  
                socket.close();  
            } catch (Exception e2) {  
                e2.printStackTrace();  
            }  
        }  
    }  
}