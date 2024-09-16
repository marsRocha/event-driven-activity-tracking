package com.marciorocha.event_driven_activity_tracking.controller;

import com.marciorocha.event_driven_activity_tracking.UserActivity;
import com.marciorocha.event_driven_activity_tracking.UserActivityService;
import com.marciorocha.event_driven_activity_tracking.dto.MessageRequest;
import com.marciorocha.event_driven_activity_tracking.kafka.MessageProducer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/activity")
@AllArgsConstructor
public class KafkaController {

    @Autowired
    private final UserActivityService userActivityService;
    @Autowired
    private final MessageProducer messageProducer;

    @GetMapping
    public List<UserActivity> getAllActivities() {
        return userActivityService.GetAllUserActivities();
    }

    @PostMapping
    public String sendMessage(@RequestBody MessageRequest messageRequest) {
        messageProducer.sendMessage("user-activity", messageRequest);
        return "Message sent" + messageRequest;
    }

    @GetMapping("/{userId}")
    public List<UserActivity> getUserActivities(@PathVariable String userId) {
        return userActivityService.GetUserActivitiesByUserId(userId);
    }


}