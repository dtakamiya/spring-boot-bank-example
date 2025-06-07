package com.example.bank.domain.model.notification;

import java.util.Objects;

/**
 * 通知ID（DDD: 値オブジェクト）
 * <p>
 * 通知を一意に識別するための値オブジェクトです。
 */
public class NotificationId {
    private final String value;

    public NotificationId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("通知IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationId that = (NotificationId) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
} 