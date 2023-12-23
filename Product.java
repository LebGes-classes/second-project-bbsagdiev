package Warehouse;

// Абстрактный класс для товара
abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для получения названия товара
    public String getName() {
        return name;
    }

    // Геттер для цены товара
    public double getPrice() {
        return price;
    }

}