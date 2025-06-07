package com.example.bank.domain.model.security;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * ログイン履歴エンティティ（DDD: エンティティ）
 * <p>
 * ユーザーのログイン履歴を表すドメインオブジェクトです。
 */
public class LoginHistory {
    private final LoginHistoryId id;
    private final String userId;
    private final LocalDateTime loginAt;
    private final String ipAddress;
    private final boolean success;

    public LoginHistory(LoginHistoryId id, String userId, LocalDateTime loginAt, String ipAddress, boolean success) {
        this.id = id;
        this.userId = userId;
        this.loginAt = loginAt;
        this.ipAddress = ipAddress;
        this.success = success;
    }

    public LoginHistoryId getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDateTime getLoginAt() {
        return loginAt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginHistory that = (LoginHistory) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 