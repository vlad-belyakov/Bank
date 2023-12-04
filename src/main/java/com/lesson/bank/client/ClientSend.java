package com.lesson.bank.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSend implements Runnable{

    public Socket clientSocket;

    private PrintWriter out;

    private String message;

    private boolean messageReady = false;

    public ClientSend() {
        try {
            clientSocket = new Socket(/*ip*/"localhost", 4001);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        Thread clientSendThread = new Thread(this, "ClientSendThread");
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        clientSendThread.start();
    }

    @Override
    public void run() {

    }
}
