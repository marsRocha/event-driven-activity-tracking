package com.marciorocha.event_driven_activity_tracking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequest {
    private String userId;
    private String activityType;
    private String pageUrl;
    private LocalDateTime timestamp;

    @Override
    public String toString() {
        return "MessageRequest{" +
                "userId=" + userId +
                ", activityType='" + activityType + '\'' +
                ", pageUrl='" + pageUrl + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
