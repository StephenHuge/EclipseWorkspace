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

public class MyClien extends JFrame{//�ͻ��˳���
 /*    public PrintWriter writer = null;
    Socket socket = null;
   //���ô���
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    Container cc;
    //��ʼ���ͻ��˳���
    public  MyClien(String title) {
        super(title);        	//���ô�������
        cc = this.getContentPane();// ��ʼ��һ�����������������Ÿ��ֿؼ�
        cc.add(ta, "North");//���ı�����ڴ�����ϲ�
        cc.add(tf, "South");//���ı�����ڴ�����²�
        tf.addActionListener(new ActionListener(){//���һ����Ϊ����������������ʱ����ִ��������Ϊ
            public void actionPerformed(ActionEvent e){
                writer.println(tf.getText());//��������ִ�ӡ��
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
        // ��������IP��ַ  
        String serverIP = "127.0.0.1";  
        // �������˶˿ں�  
        int port = 10002;  
        // ��������  
        String data = "Hello";  
        try {  
            // ��������  
            socket = new Socket(serverIP, port);  
            // ��������  
            os = socket.getOutputStream();  
            os.write(data.getBytes());  
            // ��������  
            is = socket.getInputStream();  
            byte[] b = new byte[1024];  
            int n = is.read(b);  
            // �����������  
            System.out.println("������������" + new String(b, 0, n));  
        } catch (Exception e) {  
            e.printStackTrace(); // ��ӡ�쳣��Ϣ  
        } finally {  
            try {  
                // �ر���������  
                is.close();  
                os.close();  
                socket.close();  
            } catch (Exception e2) {  
                e2.printStackTrace();  
            }  
        }  
    }  
}