package com.example.application1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendService implements ISendService{
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void sendName(String name) {
        jmsTemplate.convertAndSend("salih",name);
    }
}
