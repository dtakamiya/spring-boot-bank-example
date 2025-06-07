package com.example.bank.domain.model.transaction;

import java.util.Objects;

/**
 * 取引ID（DDD: 値オブジェクト）
 * <p>
 * 取引を一意に識別するための値オブジェクトです。
 */
public class TransactionId {
    private final String value;

    public TransactionId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("取引IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionId that = (TransactionId) o;
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