package org.example;

import java.util.HashMap;
import java.util.Map;

public class Products {

    private static Map<String, Integer> products = new HashMap<>();

    //положил корзину в отдельный класс
    {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }

    public static Map<String, Integer> getProducts() {
        return products;
    }

    //обзор корзины вывел в отдельный метод
    public static void showProduct() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}