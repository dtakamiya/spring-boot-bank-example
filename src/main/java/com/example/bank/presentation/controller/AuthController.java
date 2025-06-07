package com.example.bank.presentation.controller;

import com.example.bank.application.service.AuthApplicationService;
import com.example.bank.domain.model.user.User;
import com.example.bank.presentation.request.LoginRequest;
import com.example.bank.presentation.response.LoginResponse;
import org.springframework.web.bind.annotation.*;

/**
 * 認証APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * ログインAPIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthApplicationService authApplicationService;

    public AuthController(AuthApplicationService authApplicationService) {
        this.authApplicationService = authApplicationService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        // パスワードは本来ハッシュ化して比較する（ここでは簡易化）
        User user = authApplicationService.authenticate(request.getEmail(), request.getPassword());
        if (user != null) {
            return new LoginResponse(true, user.getId().getValue(), "ログイン成功");
        } else {
            return new LoginResponse(false, null, "メールアドレスまたはパスワードが正しくありません");
        }
    }
} 