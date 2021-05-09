package com.poc.sqs.infra.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class SqsListner {

    @SqsListener("teste")
    public void subscribeToSQSDirectly(String msg) {
        log.error("Received message: " + msg);
    }

}
