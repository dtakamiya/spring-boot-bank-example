package com.example.bank.domain.model.application;

import java.util.Objects;

/**
 * 申請ID（DDD: 値オブジェクト）
 * <p>
 * 各種申請を一意に識別するための値オブジェクトです。
 */
public class ApplicationId {
    private final String value;

    public ApplicationId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("申請IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationId that = (ApplicationId) o;
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