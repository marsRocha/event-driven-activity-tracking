package com.marciorocha.event_driven_activity_tracking.kafka;

import com.marciorocha.event_driven_activity_tracking.dto.MessageRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "user-activity", groupId = "my-group-id", containerFactory = "kafkaListenerContainerFactory")
    public void listen(MessageRequest message) {
        // Process and store the activity in MongoDB
        System.out.println("Received message: " + message);
    }
}
