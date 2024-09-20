package com.marciorocha.event_driven_activity_tracking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class UserActivity {
    @Id
    private String id;
    private String activityType;
    private String pageUrl;
    private LocalDateTime timestamp;

    public UserActivity(String activityType, String pageUrl, LocalDateTime timestamp) {
        this.activityType = activityType;
        this.pageUrl = pageUrl;
        this.timestamp = timestamp;
    }
}
