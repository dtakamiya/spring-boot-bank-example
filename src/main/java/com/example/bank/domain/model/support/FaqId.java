package com.example.bank.domain.model.support;

import java.util.Objects;

/**
 * FAQ ID（DDD: 値オブジェクト）
 * <p>
 * FAQを一意に識別するための値オブジェクトです。
 */
public class FaqId {
    private final String value;

    public FaqId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("FAQ IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FaqId faqId = (FaqId) o;
        return Objects.equals(value, faqId.value);
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