package com.example.bank.presentation.controller;

import com.example.bank.application.dto.NotificationDto;
import com.example.bank.application.service.NotificationService;
import com.example.bank.domain.model.notification.Notification;
import com.example.bank.domain.model.notification.NotificationId;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 通知APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * 通知の作成・参照・既読化APIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * 通知作成API
     */
    @PostMapping("/create")
    public void create(@RequestBody NotificationDto dto) {
        // サンプル実装: 本来はファクトリやサービスで生成
        Notification notif = new Notification(
                new NotificationId("N001"),
                dto.getUserId(),
                dto.getMessage(),
                LocalDateTime.now(),
                false
        );
        notificationService.create(notif);
    }

    /**
     * ユーザーの通知一覧参照API
     */
    @GetMapping("/user/{userId}")
    public List<NotificationDto> getByUserId(@PathVariable String userId) {
        List<Notification> notifs = notificationService.getByUserId(userId);
        return notifs.stream()
                .map(notif -> new NotificationDto(
                        notif.getId().getValue(),
                        notif.getUserId(),
                        notif.getMessage(),
                        notif.getSentAt(),
                        notif.isRead()
                ))
                .collect(Collectors.toList());
    }

    /**
     * 通知既読API
     */
    @PostMapping("/read/{notificationId}")
    public void markAsRead(@PathVariable String notificationId) {
        notificationService.markAsRead(new NotificationId(notificationId));
    }
} 