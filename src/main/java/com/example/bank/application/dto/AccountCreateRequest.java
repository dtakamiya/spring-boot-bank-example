package com.example.bank.application.dto;

/**
 * 口座開設リクエストDTO（DDD: DTO）
 * <p>
 * 口座開設APIのリクエストボディとして利用されるデータ転送オブジェクトです。
 */
public class AccountCreateRequest {
    private String ownerName;
    private String initialBalance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(String initialBalance) {
        this.initialBalance = initialBalance;
    }
} 