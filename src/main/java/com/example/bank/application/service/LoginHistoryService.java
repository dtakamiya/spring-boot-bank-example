package com.example.bank.application.service;

import com.example.bank.domain.model.security.LoginHistory;
import com.example.bank.domain.model.security.LoginHistoryId;
import com.example.bank.domain.repository.LoginHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * ログイン履歴アプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * ログイン履歴の記録・参照などのユースケースを提供します。
 */
@Service
public class LoginHistoryService {
    private final LoginHistoryRepository loginHistoryRepository;

    public LoginHistoryService(LoginHistoryRepository loginHistoryRepository) {
        this.loginHistoryRepository = loginHistoryRepository;
    }

    /**
     * ログイン履歴を記録
     */
    public void record(LoginHistory loginHistory) {
        loginHistoryRepository.save(loginHistory);
    }

    /**
     * ユーザーのログイン履歴一覧を取得
     */
    public List<LoginHistory> getByUserId(String userId) {
        return loginHistoryRepository.findByUserId(userId);
    }

    /**
     * ログイン履歴をIDで取得
     */
    public Optional<LoginHistory> getById(LoginHistoryId id) {
        return loginHistoryRepository.findById(id);
    }
} 