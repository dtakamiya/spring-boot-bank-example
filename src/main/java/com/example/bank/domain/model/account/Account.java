package com.example.bank.domain.model.account;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 口座エンティティ
 */
public class Account {
    private final AccountId id;
    private BigDecimal balance;
    private String ownerName;

    public Account(AccountId id, String ownerName, BigDecimal balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public AccountId getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("入金額は正の値である必要があります");
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("出金額は正の値である必要があります");
        if (this.balance.compareTo(amount) < 0) throw new IllegalArgumentException("残高不足です");
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 