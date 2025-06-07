package com.example.bank.application.service;

import com.example.bank.domain.model.user.User;
import com.example.bank.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

/**
 * 認証アプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * ユーザーの認証・認可に関するユースケースを提供します。
 */
@Service
public class AuthApplicationService {
    private final UserRepository userRepository;

    public AuthApplicationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * メールアドレスとパスワードで認証
     * @param email メールアドレス
     * @param passwordHash パスワード（ハッシュ済み）
     * @return 認証成功時はユーザー、失敗時はnull
     */
    public User authenticate(String email, String passwordHash) {
        return userRepository.findByEmail(email)
                .filter(user -> user.getPasswordHash().equals(passwordHash))
                .orElse(null);
    }
} 