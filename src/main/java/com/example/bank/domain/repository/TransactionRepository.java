package com.example.bank.domain.repository;

import com.example.bank.domain.model.transaction.Transaction;
import com.example.bank.domain.model.transaction.TransactionId;
import java.util.List;
import java.util.Optional;

/**
 * 取引リポジトリ（DDD: リポジトリ）
 * <p>
 * 取引エンティティの永続化・検索を担当するインターフェースです。
 */
public interface TransactionRepository {
    Optional<Transaction> findById(TransactionId id);
    List<Transaction> findByAccountId(String accountId);
    void save(Transaction transaction);
} 