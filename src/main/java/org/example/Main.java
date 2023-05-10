package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Products products = new Products();
        Products.showProduct();


        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket();
        try {
            while (true) {
                String line = scanner.nextLine();
                if ("end".equals(line)) break;
                String[] parts = line.split(" ");
                String product = parts[0];
                product = product.substring(0,1).toUpperCase() + product.substring(1);
                //если продукт ввели с маленькой буквы, меняем на заглавную
                int count = Integer.parseInt(parts[1]);
                basket.addPurchase(product, count);
            }
            long sum = basket.sum(Products.getProducts());
            System.out.println("ИТОГО: " + sum);

        }catch (Exception exception){
            System.out.println("Ошибка! Проверьте вводимые данные! ");

        }
    }
}