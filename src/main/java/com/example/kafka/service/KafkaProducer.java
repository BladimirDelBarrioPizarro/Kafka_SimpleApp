package com.example.kafka.service;

import com.example.kafka.boot.KafkaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

    @Autowired
    private KafkaProperties kafkaProperties;
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    public void sendMessageToTopic(String myTopic, final String message) {
        log.info(" -- Sending message to kafka = {}", message);
        kafkaTemplate.send(kafkaProperties.getMyTopic(), message);
    }
}
