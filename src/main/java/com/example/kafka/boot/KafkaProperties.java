package com.example.kafka.boot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KafkaProperties {

    @Value("${kafka.topic.name}")
    private String myTopic;
}
