package com.example.bank.application.service;

import com.example.bank.domain.model.support.Faq;
import com.example.bank.domain.model.support.FaqId;
import com.example.bank.domain.repository.FaqRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * FAQアプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * FAQの登録・削除・一覧取得などのユースケースを提供します。
 */
@Service
public class FaqService {
    private final FaqRepository faqRepository;

    public FaqService(FaqRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    /**
     * FAQを新規登録
     */
    public void register(Faq faq) {
        faqRepository.save(faq);
    }

    /**
     * FAQを削除
     */
    public void delete(FaqId id) {
        faqRepository.delete(id);
    }

    /**
     * FAQ一覧を取得
     */
    public List<Faq> getAll() {
        return faqRepository.findAll();
    }
} 