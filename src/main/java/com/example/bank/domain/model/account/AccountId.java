package com.example.bank.domain.model.account;

import java.util.Objects;

/**
 * 口座IDの値オブジェクト
 */
public class AccountId {
    private final String value;

    public AccountId(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("口座IDは必須です");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountId accountId = (AccountId) o;
        return Objects.equals(value, accountId.value);
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