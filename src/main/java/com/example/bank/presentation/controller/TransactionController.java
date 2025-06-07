package com.example.bank.presentation.controller;

import com.example.bank.application.dto.TransactionDto;
import com.example.bank.application.service.TransactionQueryService;
import com.example.bank.domain.model.transaction.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 取引履歴APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * 取引履歴参照APIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionQueryService transactionQueryService;

    public TransactionController(TransactionQueryService transactionQueryService) {
        this.transactionQueryService = transactionQueryService;
    }

    /**
     * 取引履歴参照API
     */
    @GetMapping("/account/{accountId}")
    public List<TransactionDto> getTransactions(@PathVariable String accountId) {
        List<Transaction> transactions = transactionQueryService.getTransactions(accountId);
        // サンプル変換: 本来はMapper等で変換
        return transactions.stream()
                .map(tx -> new TransactionDto(
                        tx.getId().getValue(),
                        tx.getAccountId(),
                        tx.getAmount(),
                        tx.getDateTime(),
                        tx.getType(),
                        tx.getDescription()
                ))
                .collect(Collectors.toList());
    }
} 