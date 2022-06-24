package com.company;

public class Product {
    private String productName;
    private String productCategory;
    private Integer price;
    private int quantity;

    public Product(String productName, String productCategory, Integer price) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String productName, String productCategory, Integer price, int quantity) {
        this(productName, productCategory, price);
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
