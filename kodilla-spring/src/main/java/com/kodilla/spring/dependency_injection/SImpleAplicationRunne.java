package com.kodilla.spring.dependency_injection;

public class SImpleAplicationRunne {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}
