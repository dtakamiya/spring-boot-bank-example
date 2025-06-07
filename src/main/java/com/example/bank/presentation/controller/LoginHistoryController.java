package com.example.bank.presentation.controller;

import com.example.bank.application.dto.LoginHistoryDto;
import com.example.bank.application.service.LoginHistoryService;
import com.example.bank.domain.model.security.LoginHistory;
import com.example.bank.domain.model.security.LoginHistoryId;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ログイン履歴APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * ログイン履歴の記録・参照APIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/login-histories")
public class LoginHistoryController {
    private final LoginHistoryService loginHistoryService;

    public LoginHistoryController(LoginHistoryService loginHistoryService) {
        this.loginHistoryService = loginHistoryService;
    }

    /**
     * ログイン履歴記録API
     */
    @PostMapping("/record")
    public void record(@RequestBody LoginHistoryDto dto) {
        // サンプル実装: 本来はファクトリやサービスで生成
        LoginHistory history = new LoginHistory(
                new LoginHistoryId("LH001"),
                dto.getUserId(),
                LocalDateTime.now(),
                dto.getIpAddress(),
                dto.isSuccess()
        );
        loginHistoryService.record(history);
    }

    /**
     * ユーザーのログイン履歴一覧参照API
     */
    @GetMapping("/user/{userId}")
    public List<LoginHistoryDto> getByUserId(@PathVariable String userId) {
        List<LoginHistory> histories = loginHistoryService.getByUserId(userId);
        return histories.stream()
                .map(h -> new LoginHistoryDto(
                        h.getId().getValue(),
                        h.getUserId(),
                        h.getLoginAt(),
                        h.getIpAddress(),
                        h.isSuccess()
                ))
                .collect(Collectors.toList());
    }
} 