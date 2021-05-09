package com.poc.sqs.domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class SqsSender {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;

    @Value("teste")
    private String queue;

    public void send(String msg) {
        queueMessagingTemplate.convertAndSend(queue, msg);
    }

}
