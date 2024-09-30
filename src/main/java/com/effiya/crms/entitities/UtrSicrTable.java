package com.effiya.crms.entitities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "utr_sicr_table")
public class UtrSicrTable {
    @Id
    private Long id ;
    private String customerId;
    private String utrQ1;
    private String utrQ2;
    private String sicrQ1;
    private String sicrQ2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSicrQ2() {
        return sicrQ2;
    }

    public void setSicrQ2(String sicrQ2) {
        this.sicrQ2 = sicrQ2;
    }

    public String getSicrQ1() {
        return sicrQ1;
    }

    public void setSicrQ1(String sicrQ1) {
        this.sicrQ1 = sicrQ1;
    }

    public String getUtrQ2() {
        return utrQ2;
    }

    public void setUtrQ2(String utrQ2) {
        this.utrQ2 = utrQ2;
    }

    public String getUtrQ1() {
        return utrQ1;
    }

    public void setUtrQ1(String utrQ1) {
        this.utrQ1 = utrQ1;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
