package com.flexon.bankaccount;

public class BalanceUpdateDTO {
    private String id;
    private Double amount;

    BalanceUpdateDTO(String id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}