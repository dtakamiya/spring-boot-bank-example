package com.example.bank.domain.model.security;

import java.util.Objects;

/**
 * ログイン履歴ID（DDD: 値オブジェクト）
 * <p>
 * ログイン履歴を一意に識別するための値オブジェクトです。
 */
public class LoginHistoryId {
    private final String value;

    public LoginHistoryId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("ログイン履歴IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginHistoryId that = (LoginHistoryId) o;
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