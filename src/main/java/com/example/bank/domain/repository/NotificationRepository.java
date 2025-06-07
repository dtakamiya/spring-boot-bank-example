package com.example.bank.domain.repository;

import com.example.bank.domain.model.notification.Notification;
import com.example.bank.domain.model.notification.NotificationId;
import java.util.List;
import java.util.Optional;

/**
 * 通知リポジトリ（DDD: リポジトリ）
 * <p>
 * 通知エンティティの永続化・検索を担当するインターフェースです。
 */
public interface NotificationRepository {
    Optional<Notification> findById(NotificationId id);
    List<Notification> findByUserId(String userId);
    void save(Notification notification);
} 