package com.example.bank.domain.service;

import com.example.bank.domain.model.account.Account;
import java.math.BigDecimal;

/**
 * 口座間振込のドメインサービス
 */
public class AccountTransferService {
    /**
     * 振込処理
     */
    public void transfer(Account from, Account to, BigDecimal amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
} 