package com.example.kafka.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "myTopic", groupId = "group_id")
    public void consume(final String message) {
        log.info(" -- Consuming message.");
        log.info(message);
    }
}
