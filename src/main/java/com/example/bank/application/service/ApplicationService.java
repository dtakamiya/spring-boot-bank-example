package com.example.bank.application.service;

import com.example.bank.domain.model.application.Application;
import com.example.bank.domain.model.application.ApplicationId;
import com.example.bank.domain.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 申請アプリケーションサービス（DDD: アプリケーションサービス）
 * <p>
 * 各種申請の作成・参照・承認・却下などのユースケースを提供します。
 */
@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    /**
     * 申請を新規作成
     */
    public void create(Application application) {
        applicationRepository.save(application);
    }

    /**
     * ユーザーの申請一覧を取得
     */
    public List<Application> getByUserId(String userId) {
        return applicationRepository.findByUserId(userId);
    }

    /**
     * 申請を承認
     */
    public void approve(ApplicationId id) {
        Optional<Application> appOpt = applicationRepository.findById(id);
        appOpt.ifPresent(app -> {
            app.approve();
            applicationRepository.save(app);
        });
    }

    /**
     * 申請を却下
     */
    public void reject(ApplicationId id) {
        Optional<Application> appOpt = applicationRepository.findById(id);
        appOpt.ifPresent(app -> {
            app.reject();
            applicationRepository.save(app);
        });
    }
} 