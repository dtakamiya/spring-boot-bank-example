package com.example.bank.presentation.request;

/**
 * ログインリクエストDTO（DDD: DTO）
 * <p>
 * ログインAPIのリクエストボディとして利用されるデータ転送オブジェクトです。
 */
public class LoginRequest {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
} 