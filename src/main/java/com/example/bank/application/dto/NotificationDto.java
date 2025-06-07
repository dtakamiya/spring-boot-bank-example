package com.example.bank.application.dto;

import java.time.LocalDateTime;

/**
 * 通知情報DTO（DDD: DTO）
 * <p>
 * 通知の入出力に利用されるデータ転送オブジェクトです。
 */
public class NotificationDto {
    private String notificationId;
    private String userId;
    private String message;
    private LocalDateTime sentAt;
    private boolean read;

    public NotificationDto() {}

    public NotificationDto(String notificationId, String userId, String message, LocalDateTime sentAt, boolean read) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.sentAt = sentAt;
        this.read = read;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
} 