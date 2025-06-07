package com.example.bank.application.service;

import com.example.bank.domain.model.account.Account;
import com.example.bank.domain.model.account.AccountId;
import com.example.bank.domain.repository.AccountRepository;
import com.example.bank.domain.service.AccountTransferService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * 口座関連ユースケースのアプリケーションサービス
 */
@Service
public class AccountApplicationService {
    private final AccountRepository accountRepository;
    private final AccountTransferService transferService;

    public AccountApplicationService(AccountRepository accountRepository, AccountTransferService transferService) {
        this.accountRepository = accountRepository;
        this.transferService = transferService;
    }

    /**
     * 口座間振込ユースケース
     */
    @Transactional
    public void transfer(String fromId, String toId, BigDecimal amount) {
        Account from = accountRepository.findById(new AccountId(fromId))
                .orElseThrow(() -> new IllegalArgumentException("送金元口座が見つかりません"));
        Account to = accountRepository.findById(new AccountId(toId))
                .orElseThrow(() -> new IllegalArgumentException("送金先口座が見つかりません"));
        transferService.transfer(from, to, amount);
        accountRepository.save(from);
        accountRepository.save(to);
    }
} 