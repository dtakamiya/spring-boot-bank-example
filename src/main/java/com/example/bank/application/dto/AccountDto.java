package com.example.bank.application.dto;

import java.math.BigDecimal;

/**
 * 口座情報DTO（DDD: DTO）
 * <p>
 * 口座情報の入出力に利用されるデータ転送オブジェクトです。
 */
public class AccountDto {
    private String accountId;
    private String ownerName;
    private BigDecimal balance;

    public AccountDto() {}

    public AccountDto(String accountId, String ownerName, BigDecimal balance) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
} 