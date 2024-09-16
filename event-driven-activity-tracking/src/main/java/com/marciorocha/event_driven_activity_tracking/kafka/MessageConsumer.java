package com.marciorocha.event_driven_activity_tracking.kafka;

import com.marciorocha.event_driven_activity_tracking.UserActivityService;
import com.marciorocha.event_driven_activity_tracking.dto.MessageRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MessageConsumer {

    @Autowired
    private final UserActivityService userActivityService;

    @KafkaListener(topics = "user-activity", groupId = "my-group-id", containerFactory = "kafkaListenerContainerFactory")
    public void listen(MessageRequest message) {
        // Process and store the activity in MongoDB
        userActivityService.RegisterUserActivity(message);

        System.out.println("Received message: " + message);
    }
}
