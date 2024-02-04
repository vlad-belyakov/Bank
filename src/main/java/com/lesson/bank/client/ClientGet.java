package com.lesson.bank.client;

import com.lesson.bank.MainScreenController;
import com.lesson.bank.RegistrationScreenController;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

@Component
public class ClientGet implements Runnable{

    public RegistrationScreenController registrationScreenController;
    private BufferedReader in;
    private final MainScreenController mainScreenController;
    private Socket clientSocket;

    public ClientGet(ClientSend clientSend, MainScreenController mainScreenController){
        this.clientSocket = clientSend.clientSocket;
        this.mainScreenController = mainScreenController;
        Thread clientGetThread = new Thread(this,"ClientGetThread");
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        clientGetThread.start();
    }

    @Override
    public void run() {
        String msg;
        while (true){
            try {
                if ((msg = in.readLine()) != null) {
                    if(msg.startsWith("@")){
                        msg = msg.replace("@", "");
                        Method method = methodMap.get(msg);
                        Object[] objects = new Object[0];
                        mainScreenController.setPass((boolean) method.invoke(cl, new Object[]{objects}));
                        mainScreenController.setWaiting(false);
                    } else {
                        String[] message = msg.split("/");
                        StringBuilder mes = new StringBuilder(message[1]);
                        if(message.length >= 3) {
                            for (int i = 2; i <= message.length - 1; i++) {
                                mes.append("/").append(message[i]);
                            }
                        } else {
                            mes = new StringBuilder(message[1]);
                        }
                        msg = mes.toString();
                        chatScreenController.appendTextArea(msg, message[0]);
                    }
                }
            }catch (IOException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


}
