package com.example.bank.application.dto;

import java.time.LocalDateTime;

/**
 * ログイン履歴DTO（DDD: DTO）
 * <p>
 * ログイン履歴の入出力に利用されるデータ転送オブジェクトです。
 */
public class LoginHistoryDto {
    private String loginHistoryId;
    private String userId;
    private LocalDateTime loginAt;
    private String ipAddress;
    private boolean success;

    public LoginHistoryDto() {}

    public LoginHistoryDto(String loginHistoryId, String userId, LocalDateTime loginAt, String ipAddress, boolean success) {
        this.loginHistoryId = loginHistoryId;
        this.userId = userId;
        this.loginAt = loginAt;
        this.ipAddress = ipAddress;
        this.success = success;
    }

    public String getLoginHistoryId() {
        return loginHistoryId;
    }

    public void setLoginHistoryId(String loginHistoryId) {
        this.loginHistoryId = loginHistoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(LocalDateTime loginAt) {
        this.loginAt = loginAt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
} 