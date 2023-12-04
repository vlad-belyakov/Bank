package com.lesson.bank.server;

import java.io.BufferedReader;
import java.net.Socket;

public class ServerGet implements Runnable{

    private Socket gettedClientSocket;
    private BufferedReader in;
    private ServerSend serverSend;
    private ServerClient serverClient;

    public ServerGet(Socket socket){
        gettedClientSocket = socket;
    }

    @Override
    public void run() {

    }
}
