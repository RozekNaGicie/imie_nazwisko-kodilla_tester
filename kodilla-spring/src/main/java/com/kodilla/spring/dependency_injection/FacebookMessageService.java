package com.kodilla.spring.dependency_injection;

public class FacebookMessageService implements MessageService {

    @Override
    public void send(String message, String receiver){
        System.out.println("Sending message [" + message + "] to " + receiver + "using facebook");
    }
}
