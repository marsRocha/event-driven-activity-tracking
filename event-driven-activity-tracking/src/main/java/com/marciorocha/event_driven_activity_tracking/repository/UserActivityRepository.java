package com.marciorocha.event_driven_activity_tracking.repository;

import com.marciorocha.event_driven_activity_tracking.UserActivity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserActivityRepository extends MongoRepository<UserActivity, String> {
    List<UserActivity> findByUserId(String userId);
}
