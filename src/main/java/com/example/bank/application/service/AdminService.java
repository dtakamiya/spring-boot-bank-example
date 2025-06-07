package com.example.bank.application.service;

import com.example.bank.domain.model.admin.Admin;
import com.example.bank.domain.model.admin.AdminId;
import com.example.bank.domain.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 管理者アプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * 管理者の登録・削除・権限変更などのユースケースを提供します。
 */
@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    /**
     * 管理者を新規登録
     */
    public void register(Admin admin) {
        adminRepository.save(admin);
    }

    /**
     * 管理者を削除
     */
    public void delete(AdminId id) {
        adminRepository.delete(id);
    }

    /**
     * 管理者の権限を変更
     */
    public void changeRole(AdminId id, String newRole) {
        Optional<Admin> adminOpt = adminRepository.findById(id);
        adminOpt.ifPresent(admin -> {
            admin.changeRole(newRole);
            adminRepository.save(admin);
        });
    }

    /**
     * 管理者一覧を取得
     */
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }
} 