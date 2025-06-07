package com.example.bank.domain.repository;

import com.example.bank.domain.model.application.Application;
import com.example.bank.domain.model.application.ApplicationId;
import java.util.List;
import java.util.Optional;

/**
 * 申請リポジトリ（DDD: リポジトリ）
 * <p>
 * 各種申請エンティティの永続化・検索を担当するインターフェースです。
 */
public interface ApplicationRepository {
    Optional<Application> findById(ApplicationId id);
    List<Application> findByUserId(String userId);
    void save(Application application);
} 