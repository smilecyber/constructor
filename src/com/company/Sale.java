package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Sale {
    private LocalDateTime saleDate;
    private Integer amount;
    private List<Product> productList;
    private boolean canBeIncludedBonusCalculation;

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public boolean isCanBeIncludedBonusCalculation() {
        return canBeIncludedBonusCalculation && amount > 300;
    }

    public void setCanBeIncludedBonusCalculation(boolean canBeIncludedBonusCalculation) {
        this.canBeIncludedBonusCalculation = canBeIncludedBonusCalculation;
    }
}
