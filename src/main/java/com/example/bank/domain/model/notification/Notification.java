package com.example.bank.domain.model.notification;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 通知エンティティ（DDD: エンティティ）
 * <p>
 * 取引完了や重要なお知らせなど、ユーザーへの通知を表すドメインオブジェクトです。
 */
public class Notification {
    private final NotificationId id;
    private final String userId;
    private final String message;
    private final LocalDateTime sentAt;
    private boolean read;

    public Notification(NotificationId id, String userId, String message, LocalDateTime sentAt, boolean read) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.sentAt = sentAt;
        this.read = read;
    }

    public NotificationId getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public boolean isRead() {
        return read;
    }

    public void markAsRead() {
        this.read = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 