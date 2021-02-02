package ir.ac.kntu;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.Serializable;

public class MySocket implements Serializable{
    private Socket socket = null;
    private static final MySocket client = new MySocket();

    public MySocket getClient() {
        return client;
    }

    public static void run() throws UnknownHostException, IOException, ClassNotFoundException {
        String ip = "132.12.4.1";
        int port = 1080;
        client.connectSocket(ip, port);

    }

    private void connectSocket(String ip, int port) throws UnknownHostException, IOException {
        this.socket = new Socket(ip, port);
    }

    public String print(String text) {
        try {
            PrintWriter printWriter = new PrintWriter(getSocket().getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getSocket().getInputStream()));
            printWriter.println(text);
            return bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("INVALID");
        }
        return null;
    }

    private Socket getSocket() {
        return socket;

    }

}