package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticConstant {
    static Product product1 = new Product("playstation", "Electronic", 550);
    static Product product2 = new Product("Xbox", "Electronic", 430, 5);
    static Product product3 = new Product("Chair", "Furniture", 220, 30);
    static Product product4 = new Product("Usb", "Electronic", 24, 12);
    static Product product5 = new Product("Hdd", "Electronic", 56, 20);
    public static List<Product> PRODUCT_LIST = new ArrayList<>
            (Arrays.asList(product1,product2,product3,product3,product4,product5));

}
