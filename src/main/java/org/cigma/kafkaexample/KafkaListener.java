package org.cigma.kafkaexample;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "test-cigma",
            groupId = "org.cigma"
    )
    void listener(String data){
        System.out.println("Listener received: "+ data);
    }
}
