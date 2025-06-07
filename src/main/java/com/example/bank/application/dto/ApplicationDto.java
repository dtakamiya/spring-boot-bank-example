package com.example.bank.application.dto;

import java.time.LocalDateTime;

/**
 * 申請情報DTO（DDD: DTO）
 * <p>
 * 各種申請の入出力に利用されるデータ転送オブジェクトです。
 */
public class ApplicationDto {
    private String applicationId;
    private String userId;
    private String type;
    private String content;
    private LocalDateTime appliedAt;
    private String status;

    public ApplicationDto() {}

    public ApplicationDto(String applicationId, String userId, String type, String content, LocalDateTime appliedAt, String status) {
        this.applicationId = applicationId;
        this.userId = userId;
        this.type = type;
        this.content = content;
        this.appliedAt = appliedAt;
        this.status = status;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(LocalDateTime appliedAt) {
        this.appliedAt = appliedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
} 