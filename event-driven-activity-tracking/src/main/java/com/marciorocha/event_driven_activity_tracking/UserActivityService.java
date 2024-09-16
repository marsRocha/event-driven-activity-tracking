package com.marciorocha.event_driven_activity_tracking;

import com.marciorocha.event_driven_activity_tracking.dto.MessageRequest;
import com.marciorocha.event_driven_activity_tracking.repository.UserActivityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserActivityService {

    @Autowired
    private final UserActivityRepository userActivityRepository;

    public List<UserActivity> GetAllUserActivities() {
        return userActivityRepository.findAll();
    }

    public List<UserActivity> GetUserActivitiesByUserId(String userId) {
        return userActivityRepository.findByUserId(userId);
    }

    public void RegisterUserActivity(MessageRequest messageRequest) {

        UserActivity u = new UserActivity(
                messageRequest.getUserId(),
                messageRequest.getActivityType(),
                messageRequest.getPageUrl(),
                messageRequest.getTimestamp()
        );

        userActivityRepository.insert(u);
    }
}
