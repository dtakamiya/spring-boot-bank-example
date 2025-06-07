package com.example.bank.application.dto;

/**
 * 管理者情報DTO（DDD: DTO）
 * <p>
 * 管理者情報の入出力に利用されるデータ転送オブジェクトです。
 */
public class AdminDto {
    private String adminId;
    private String name;
    private String email;
    private String role;

    public AdminDto() {}

    public AdminDto(String adminId, String name, String email, String role) {
        this.adminId = adminId;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
} 