package com.marciorocha.event_driven_activity_tracking.kafka;

import com.marciorocha.event_driven_activity_tracking.dto.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, MessageRequest> kafkaTemplate;

    public void sendMessage(String topic, MessageRequest messageRequest) {
        kafkaTemplate.send(topic, messageRequest);
    }

}
