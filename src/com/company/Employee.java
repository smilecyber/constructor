package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.TAX_RATE;

public class Employee {
    private String name;
    private String surname;
    private Integer salary;
    private Integer salaryAfterTax;
    private List<Sale> saleList;
    private Integer bonus;

    public Employee(String name, String surname, Integer salary) {
        bonus = 0;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        displayEmployee();
    }

    public Employee(String name, String surname, Integer salary, List<Sale> saleList) {
        this(name, surname, salary);
        for (Sale sale : saleList) {
            if (sale.isCanBeIncludedBonusCalculation()) {
                bonus += ((sale.getAmount() * 2) / 100);
            }
        }
        if (getSaleList() == null || getSaleList().size() == 0) {
            setSaleList(saleList);
        } else {
            this.saleList.addAll(saleList);
        }
        System.out.println("You earn " + bonus + " bonus from your sales");
    }

    public Employee(String name, String surname, Integer salary, Sale sale) {
        this(name, surname, salary);
        if (sale.isCanBeIncludedBonusCalculation()) {
            bonus += ((sale.getAmount() * 2) / 100);
        }
        if (getSaleList() != null && getSaleList().size() > 0) {
            this.saleList.add(sale);
        } else {
            this.saleList = new ArrayList<>();
        }
        System.out.println("You earn " + bonus + " bonus from your sales");
    }

    public Employee(String name, String surname, Integer salary, Double bonus) {
        this(name, surname, salary);
        System.out.println("You earn minimum amount " + bonus + " for bonus because This means that you couldn't sell anything");
    }

    public Employee(String name, String surname, Integer salary, List<Sale> saleList, Integer bonus) {
        // this means you have reached limit, you will get extra bonus
        this(name, surname, salary, saleList);
        this.bonus += bonus;
        System.out.println("You earned extra bonus. Bonus Amount " + this.bonus);
    }

    public void displayEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Salary before tax: " + this.salary);
        System.out.println("Salary after tax: " + getSalaryAfterTaxWithBonus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    private void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getSalaryAfterTaxWithBonus() {
        int salaryWithBonus = salary + bonus;
        salaryAfterTax = salaryWithBonus - (salaryWithBonus * TAX_RATE / 100);
        return salaryAfterTax;
    }
}
