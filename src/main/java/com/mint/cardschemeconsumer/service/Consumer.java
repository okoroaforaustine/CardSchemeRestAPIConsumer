/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mint.cardschemeconsumer.service;

import java.io.IOException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author austine.okoroafor
 */
@Service
public class Consumer {
    
    
     @KafkaListener(topics = "com.ng.vela.even.card_verified", groupId = "group_id")
    public void consume(String message) throws IOException {
        System.out.println(String.format("#### -> Consumed message -> %s", message));
    }
}
