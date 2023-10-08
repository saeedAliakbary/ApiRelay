package com.apiRelay.firstserver.communication;

import com.relay.apirelay.message.Message;

public class MessageHandler {
    public void handleMessage(Message message) {
        System.out.println("Received message:");
        System.out.println("API: " + message.getApi());
        System.out.println("Data: " + message.getData());
    }
}