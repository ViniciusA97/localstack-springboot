package com.poc.sqs;

import com.poc.sqs.domain.service.SqsSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class SqsApplication {

    @Autowired
    public SqsSender sqsSender;

    public static void main(String[] args) {
        SpringApplication.run(SqsApplication.class, args);
    }

    @PostConstruct
    @Lazy
    public void teste(){
        for(int i =0 ; i<3; i++){
            log.info("Sending message...");
            sqsSender.send("Teste Message: "+i);
        }
    }

}
