package com.marciorocha.event_driven_activity_tracking.dto;

import java.time.LocalDateTime;

/*
public record MessageRequest (
        Integer userId,
        String activityType,
        String pageUrl,
        LocalDateTime timestamp
) {
}
*/

public class MessageRequest {
    private Integer userId;
    private String activityType;
    private String pageUrl;
    private LocalDateTime timestamp;

    public MessageRequest() {}

    public MessageRequest(Integer userId, String activityType, String pageUrl, LocalDateTime timestamp){
        this.userId = userId;
        this.activityType = activityType;
        this.pageUrl = pageUrl;
        this.timestamp = timestamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

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
