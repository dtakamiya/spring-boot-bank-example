package com.example.bank.application.service;

import com.example.bank.domain.model.notification.Notification;
import com.example.bank.domain.model.notification.NotificationId;
import com.example.bank.domain.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 通知アプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * 通知の作成・参照・既読化などのユースケースを提供します。
 */
@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    /**
     * 通知を新規作成
     */
    public void create(Notification notification) {
        notificationRepository.save(notification);
    }

    /**
     * ユーザーの通知一覧を取得
     */
    public List<Notification> getByUserId(String userId) {
        return notificationRepository.findByUserId(userId);
    }

    /**
     * 通知を既読にする
     */
    public void markAsRead(NotificationId id) {
        Optional<Notification> notifOpt = notificationRepository.findById(id);
        notifOpt.ifPresent(notif -> {
            notif.markAsRead();
            notificationRepository.save(notif);
        });
    }
} 