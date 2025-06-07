package com.example.bank.domain.model.user;

import java.util.Objects;

/**
 * ユーザーID（DDD: 値オブジェクト）
 * <p>
 * ユーザーを一意に識別するための値オブジェクトです。
 */
public class UserId {
    private final String value;

    public UserId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("ユーザーIDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId = (UserId) o;
        return Objects.equals(value, userId.value);
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