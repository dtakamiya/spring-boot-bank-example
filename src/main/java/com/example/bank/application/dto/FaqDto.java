package com.example.bank.application.dto;

/**
 * FAQ情報DTO（DDD: DTO）
 * <p>
 * FAQ情報の入出力に利用されるデータ転送オブジェクトです。
 */
public class FaqDto {
    private String faqId;
    private String question;
    private String answer;

    public FaqDto() {}

    public FaqDto(String faqId, String question, String answer) {
        this.faqId = faqId;
        this.question = question;
        this.answer = answer;
    }

    public String getFaqId() {
        return faqId;
    }

    public void setFaqId(String faqId) {
        this.faqId = faqId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
} 