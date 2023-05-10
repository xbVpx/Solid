package org.example;

import java.util.Map;

public class Basket {
    // выдержал принцип единственной ответственности
    protected Purchase[] purchases = new Purchase[Products.getProducts().size()];

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prod) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prod.get(purchase.title)) + " руб.");
            sum += (long) purchase.count * prod.get(purchase.title);
        }
        return sum;
    }
}
