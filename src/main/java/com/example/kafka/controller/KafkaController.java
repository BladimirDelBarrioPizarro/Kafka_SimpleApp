package com.example.kafka.controller;

import com.example.kafka.boot.KafkaProperties;
import com.example.kafka.model.KafkaModel;
import com.example.kafka.service.KafkaProducer;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProperties kafkaProperties;
    @Autowired
    private KafkaProducer kafkaProducer;
    @Autowired
    private Gson gson;



    @PostMapping
    public void post(@RequestBody KafkaModel kafkaModel){
      log.info(" -- POST {}",kafkaModel.toString());
      kafkaProducer.sendMessageToTopic(kafkaProperties.getMyTopic(), gson.toJson(kafkaModel));
    }

}
