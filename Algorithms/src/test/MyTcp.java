package test;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTcp{
        private BufferedReader reader;
        private ServerSocket server;
        private Socket socket;
        void getServer(){
            try {
                server = new ServerSocket(8997);
                System.out.println("ServerSocket's creation succeeds");
                while(true){
                    System.out.println("waiting for client's connection");
                    socket = server.accept();
                    reader = new BufferedReader(new InputStreamReader(socket
                            .getInputStream()));
                    getClientMessage();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        private void getClientMessage(){
            try {
                while (true) {
                    System.out.println("¿Í»§»ú" + reader.readLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (reader != null)
                    reader.close();
                if(socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void main(String[] args){
            MyTcp tcp = new MyTcp();
            tcp.getServer();
        }

    }