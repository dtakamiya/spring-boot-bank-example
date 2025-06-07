package com.example.bank.domain.repository;

import com.example.bank.domain.model.admin.Admin;
import com.example.bank.domain.model.admin.AdminId;
import java.util.List;
import java.util.Optional;

/**
 * 管理者リポジトリ（DDD: リポジトリ）
 * <p>
 * 管理者エンティティの永続化・検索を担当するインターフェースです。
 */
public interface AdminRepository {
    Optional<Admin> findById(AdminId id);
    Optional<Admin> findByEmail(String email);
    List<Admin> findAll();
    void save(Admin admin);
    void delete(AdminId id);
} 