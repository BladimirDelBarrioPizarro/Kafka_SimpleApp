package com.example.kafka.model;

import lombok.*;

@Data
@Builder
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class KafkaModel {
    private String field1;
    private String field2;
}
