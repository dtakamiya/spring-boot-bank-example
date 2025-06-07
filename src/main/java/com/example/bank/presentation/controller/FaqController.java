package com.example.bank.presentation.controller;

import com.example.bank.application.dto.FaqDto;
import com.example.bank.application.service.FaqService;
import com.example.bank.domain.model.support.Faq;
import com.example.bank.domain.model.support.FaqId;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * FAQ APIコントローラ（DDD: プレゼンテーション層／コントローラ）
 * <p>
 * FAQの登録・削除・一覧取得APIのエンドポイントを提供します。
 */
@RestController
@RequestMapping("/faqs")
public class FaqController {
    private final FaqService faqService;

    public FaqController(FaqService faqService) {
        this.faqService = faqService;
    }

    /**
     * FAQ登録API
     */
    @PostMapping("/register")
    public void register(@RequestBody FaqDto dto) {
        Faq faq = new Faq(
                new FaqId(dto.getFaqId()),
                dto.getQuestion(),
                dto.getAnswer()
        );
        faqService.register(faq);
    }

    /**
     * FAQ削除API
     */
    @DeleteMapping("/{faqId}")
    public void delete(@PathVariable String faqId) {
        faqService.delete(new FaqId(faqId));
    }

    /**
     * FAQ一覧取得API
     */
    @GetMapping("")
    public List<FaqDto> getAll() {
        List<Faq> faqs = faqService.getAll();
        return faqs.stream()
                .map(f -> new FaqDto(
                        f.getId().getValue(),
                        f.getQuestion(),
                        f.getAnswer()
                ))
                .collect(Collectors.toList());
    }
} 