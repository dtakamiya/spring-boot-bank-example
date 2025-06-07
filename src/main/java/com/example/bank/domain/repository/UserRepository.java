package com.example.bank.domain.repository;

import com.example.bank.domain.model.user.User;
import com.example.bank.domain.model.user.UserId;
import java.util.Optional;

/**
 * ユーザーリポジトリ（DDD: リポジトリ）
 * <p>
 * ユーザーエンティティの永続化・検索を担当するインターフェースです。
 */
public interface UserRepository {
    Optional<User> findById(UserId id);
    Optional<User> findByEmail(String email);
    void save(User user);
} 