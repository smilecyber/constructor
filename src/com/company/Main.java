package com.company;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.company.StaticConstant.PRODUCT_LIST;

public class Main {
    public static final int TAX_RATE = 12;

    public static void main(String[] args) {
        new StaticConstant();
        Company company1 = new Company("A Firm", "Fintech");
        Employee employee1 = new Employee("Sam", "Jackson", 1800);
        company1.addEmployee(employee1);
        List<Product> productList = new ArrayList<>();
        int saleAmount = 0;

        Product product1 = PRODUCT_LIST.get(1);
        Product product2 = PRODUCT_LIST.get(2);
        saleAmount+= product1.getPrice();
        saleAmount+= product2.getPrice();
        productList.add(product1);
        productList.add(product2);

        Sale sale = new Sale();
        sale.setAmount(saleAmount);
        sale.setSaleDate(LocalDateTime.now());
        sale.setProductList(productList);
        sale.setCanBeIncludedBonusCalculation(true);

        Employee employee2 = new Employee("Jose", "Sanchez", 2800 ,sale);
        company1.addEmployee(employee2);
    }
}
