package com.example.bank.application.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 取引情報DTO（DDD: DTO）
 * <p>
 * 取引履歴の入出力に利用されるデータ転送オブジェクトです。
 */
public class TransactionDto {
    private String transactionId;
    private String accountId;
    private BigDecimal amount;
    private LocalDateTime dateTime;
    private String type;
    private String description;

    public TransactionDto() {}

    public TransactionDto(String transactionId, String accountId, BigDecimal amount, LocalDateTime dateTime, String type, String description) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.dateTime = dateTime;
        this.type = type;
        this.description = description;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
} 