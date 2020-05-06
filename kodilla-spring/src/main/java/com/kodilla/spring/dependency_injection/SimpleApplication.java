package com.kodilla.spring.dependency_injection;

import sun.java2d.pipe.SpanShapeRenderer;

public class SimpleApplication {

    private MessageService messageService;

    SimpleApplication(MessageService messageService){
        this.messageService = messageService;
    }
    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
