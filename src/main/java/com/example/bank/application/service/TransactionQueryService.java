package com.example.bank.application.service;

import com.example.bank.domain.model.transaction.Transaction;
import com.example.bank.domain.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 取引履歴参照アプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * 取引履歴の取得ユースケースを提供します。
 */
@Service
public class TransactionQueryService {
    private final TransactionRepository transactionRepository;

    public TransactionQueryService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    /**
     * 指定口座の取引履歴を取得
     * @param accountId 口座ID
     * @return 取引リスト
     */
    public List<Transaction> getTransactions(String accountId) {
        return transactionRepository.findByAccountId(accountId);
    }
} 