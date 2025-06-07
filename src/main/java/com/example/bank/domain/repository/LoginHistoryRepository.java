package com.example.bank.domain.repository;

import com.example.bank.domain.model.security.LoginHistory;
import com.example.bank.domain.model.security.LoginHistoryId;
import java.util.List;
import java.util.Optional;

/**
 * ログイン履歴リポジトリ（DDD: リポジトリ）
 * <p>
 * ログイン履歴エンティティの永続化・検索を担当するインターフェースです。
 */
public interface LoginHistoryRepository {
    Optional<LoginHistory> findById(LoginHistoryId id);
    List<LoginHistory> findByUserId(String userId);
    void save(LoginHistory loginHistory);
} 