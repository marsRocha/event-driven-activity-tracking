package com.marciorocha.event_driven_activity_tracking.controller;

import com.marciorocha.event_driven_activity_tracking.dto.MessageRequest;
import com.marciorocha.event_driven_activity_tracking.kafka.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/activity")
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping
    public String sendMessage(@RequestBody MessageRequest messageRequest) {
        messageProducer.sendMessage("user-activity", messageRequest);
        return "Message sent" + messageRequest;
    }

}