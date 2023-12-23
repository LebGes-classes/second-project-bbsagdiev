package Warehouse;

import java.util.ArrayList;
import java.util.List;

// Класс для пункта продаж
class SalesPoint {
    private List<Product> products;
    private boolean isOpen;

    public SalesPoint() {
        this.products = new ArrayList<>();
        this.isOpen = false;
    }

    // Метод для отображения информации о товарах на складе пункта продаж
    public void displayProducts() {
        System.out.println("Товары на складе пункта продаж:");
        for (Product product : products) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice());
        }
    }

    // Метод для продажи товара
    public void sellProduct(Product product) {
        if (products.contains(product)) {
            products.remove(product);
            System.out.println("Товар продан.");
        } else {
            System.out.println("Такого товара нет на складе пункта продаж.");
        }
    }

    // Метод для возврата товара в пункт продаж
    public void returnProduct(Product product) {
        System.out.println("Товар возвращен в пункт продаж.");
        products.add(product);
    }

}