package com.example.bank.domain.model.support;

import java.util.Objects;

/**
 * FAQエンティティ（DDD: エンティティ）
 * <p>
 * 銀行システムのよくある質問を表すドメインオブジェクトです。
 */
public class Faq {
    private final FaqId id;
    private String question;
    private String answer;

    public Faq(FaqId id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public FaqId getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faq faq = (Faq) o;
        return Objects.equals(id, faq.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
} 