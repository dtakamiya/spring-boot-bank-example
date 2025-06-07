package com.example.bank.domain.model.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 取引エンティティ（DDD: エンティティ）
 * <p>
 * 銀行口座の入出金や振込などの取引を表すドメインオブジェクトです。
 */
public class Transaction {
    private final TransactionId id;
    private final String accountId;
    private final BigDecimal amount;
    private final LocalDateTime dateTime;
    private final String type; // "DEPOSIT", "WITHDRAWAL", "TRANSFER" など
    private final String description;

    public Transaction(TransactionId id, String accountId, BigDecimal amount, LocalDateTime dateTime, String type, String description) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
        this.dateTime = dateTime;
        this.type = type;
        this.description = description;
    }

    public TransactionId getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 