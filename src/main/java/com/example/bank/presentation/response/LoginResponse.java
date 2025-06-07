package com.example.bank.presentation.response;

/**
 * ログインレスポンスDTO（DDD: DTO）
 * <p>
 * ログインAPIのレスポンスボディとして利用されるデータ転送オブジェクトです。
 */
public class LoginResponse {
    private boolean success;
    private String userId;
    private String message;

    public LoginResponse() {}

    public LoginResponse(boolean success, String userId, String message) {
        this.success = success;
        this.userId = userId;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
} 