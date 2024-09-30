package com.effiya.crms.entitities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "utr_sicr_question_code_mapping")
public class UtrSicrQuestionCodeMapping {

    @Id
    private Long id;
    private String utrSicrQuestion;
    private String code;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUtrSicrQuestion() {
        return utrSicrQuestion;
    }

    public void setUtrSicrQuestion(String utrSicrQuestion) {
        this.utrSicrQuestion = utrSicrQuestion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
