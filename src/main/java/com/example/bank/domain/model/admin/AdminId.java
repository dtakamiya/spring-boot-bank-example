package com.example.bank.domain.model.admin;

import java.util.Objects;

/**
 * 管理者ID（DDD: 値オブジェクト）
 * <p>
 * 管理者を一意に識別するための値オブジェクトです。
 */
public class AdminId {
    private final String value;

    public AdminId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("管理者IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminId adminId = (AdminId) o;
        return Objects.equals(value, adminId.value);
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