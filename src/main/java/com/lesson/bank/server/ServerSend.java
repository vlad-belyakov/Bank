package com.lesson.bank.server;

import java.net.Socket;

public class ServerSend implements Runnable{

    private final Socket clientSocket;
    private String msg;
    private ServerClient serverClient;
    private boolean isMsgGot = false;
    private boolean isCmdGot = false;
    private String cmd;

    public ServerSend(Socket clientSocket) {
        this.clientSocket = clientSocket;
        Thread serverSendThread = new Thread(this, "ServerSendThread");
        serverSendThread.start();
    }

    @Override
    public void run() {

    }
}
