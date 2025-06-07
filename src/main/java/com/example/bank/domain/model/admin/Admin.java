package com.example.bank.domain.model.admin;

import java.util.Objects;

/**
 * 管理者エンティティ（DDD: エンティティ）
 * <p>
 * 銀行システムの管理者を表すドメインオブジェクトです。
 */
public class Admin {
    private final AdminId id;
    private String name;
    private String email;
    private String passwordHash;
    private String role; // "SUPER_ADMIN", "OPERATOR" など

    public Admin(AdminId id, String name, String email, String passwordHash, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public AdminId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRole() {
        return role;
    }

    public void changePassword(String newPasswordHash) {
        this.passwordHash = newPasswordHash;
    }

    public void changeRole(String newRole) {
        this.role = newRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(id, admin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 