package com.example.bank.presentation.controller;

import com.example.bank.application.service.AccountApplicationService;
import com.example.bank.presentation.request.TransferRequest;
import com.example.bank.application.dto.AccountDto;
import com.example.bank.application.dto.AccountCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 口座APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * 口座開設・参照・振込APIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountApplicationService accountApplicationService;

    public AccountController(AccountApplicationService accountApplicationService) {
        this.accountApplicationService = accountApplicationService;
    }

    @PostMapping("/transfer")
    public ResponseEntity<?> transfer(@RequestBody TransferRequest request) {
        accountApplicationService.transfer(request.getFromAccountId(), request.getToAccountId(), request.getAmount());
        return ResponseEntity.ok().build();
    }

    /**
     * 口座開設API
     */
    @PostMapping("/open")
    public AccountDto openAccount(@RequestBody AccountCreateRequest request) {
        // サンプル実装: 本来はアプリケーションサービスで生成・保存
        AccountDto dto = new AccountDto("A0001", request.getOwnerName(), new java.math.BigDecimal(request.getInitialBalance()));
        return dto;
    }

    /**
     * 口座参照API
     */
    @GetMapping("/{accountId}")
    public AccountDto getAccount(@PathVariable String accountId) {
        // サンプル実装: 本来はアプリケーションサービスで取得
        return new AccountDto(accountId, "サンプルユーザー", new java.math.BigDecimal("10000"));
    }
} 