package com.example.application2.Services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageConsumerService {
    @JmsListener(destination = "salih")
    public void listener(String name){
        System.out.println("Implemented receiving messages from Queue");
        System.out.println("Message :"+name);
    }
}
