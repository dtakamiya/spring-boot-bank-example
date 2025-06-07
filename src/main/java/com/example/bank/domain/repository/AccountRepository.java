package com.example.bank.domain.repository;

import com.example.bank.domain.model.account.Account;
import com.example.bank.domain.model.account.AccountId;
import java.util.Optional;

/**
 * 口座リポジトリ
 */
public interface AccountRepository {
    Optional<Account> findById(AccountId id);
    void save(Account account);
} 