package com.example.bank.domain.repository;

import com.example.bank.domain.model.support.Faq;
import com.example.bank.domain.model.support.FaqId;
import java.util.List;
import java.util.Optional;

/**
 * FAQリポジトリ（DDD: リポジトリ）
 * <p>
 * FAQエンティティの永続化・検索を担当するインターフェースです。
 */
public interface FaqRepository {
    Optional<Faq> findById(FaqId id);
    List<Faq> findAll();
    void save(Faq faq);
    void delete(FaqId id);
} 