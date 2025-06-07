package com.example.bank.domain.model.application;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 各種申請エンティティ（DDD: エンティティ）
 * <p>
 * 住所変更や証明書発行など、銀行への各種申請を表すドメインオブジェクトです。
 */
public class Application {
    private final ApplicationId id;
    private final String userId;
    private final String type; // "ADDRESS_CHANGE", "CERTIFICATE_REQUEST" など
    private final String content;
    private final LocalDateTime appliedAt;
    private String status; // "PENDING", "APPROVED", "REJECTED"

    public Application(ApplicationId id, String userId, String type, String content, LocalDateTime appliedAt, String status) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.content = content;
        this.appliedAt = appliedAt;
        this.status = status;
    }

    public ApplicationId getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getAppliedAt() {
        return appliedAt;
    }

    public String getStatus() {
        return status;
    }

    public void approve() {
        this.status = "APPROVED";
    }

    public void reject() {
        this.status = "REJECTED";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 