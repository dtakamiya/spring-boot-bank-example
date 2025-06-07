package com.example.bank.domain.model.user;

import java.util.Objects;

/**
 * ユーザーエンティティ（DDD: エンティティ）
 * <p>
 * 銀行システムの利用者を表すドメインオブジェクト。
 * ユーザーID、氏名、メールアドレス、パスワード（ハッシュ）などを保持します。
 */
public class User {
    private final UserId id;
    private String name;
    private String email;
    private String passwordHash;

    public User(UserId id, String name, String email, String passwordHash) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    public UserId getId() {
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

    public void changePassword(String newPasswordHash) {
        this.passwordHash = newPasswordHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 