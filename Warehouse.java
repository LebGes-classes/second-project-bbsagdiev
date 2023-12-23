package Warehouse;

import java.util.ArrayList;
import java.util.List;
// Класс для склада
class Warehouse {
    private List<Product> products;
    private List<Employee> employees; // Поле для хранения списка сотрудников
    private boolean isOpen;
    private Employee responsibleEmployee;

    public Warehouse() {
        this.products = new ArrayList<>();
        this.isOpen = false;
    }

    // Методы для управления складом
    public void addProduct(Product product) {
        // Логика добавления товара на склад
        products.add(product);
    }

    // Метод перемещения товаров между складами
    public void moveProduct(Product product, Warehouse destinationWarehouse) {
        if (products.contains(product) && destinationWarehouse != null) {
            // Если товар есть на данном складе и есть целевой склад
            products.remove(product); // Удаляем товар с текущего склада
            destinationWarehouse.addProduct(product); // Добавляем товар на целевой склад
            System.out.println("Товар перемещен на другой склад.");
        } else {
            System.out.println("Ошибка перемещения товара.");
        }
    }

    // Метод смены ответственного лица на складе
    public void changeResponsibleEmployee(Employee newResponsible) {
        if (newResponsible != null) {
            responsibleEmployee = newResponsible;
            System.out.println("Ответственное лицо на складе изменено.");
        } else {
            System.out.println("Ошибка при смене ответственного лица.");
        }
    }

    // Метод для закупки товара
    public void purchaseProduct(Product product) {
        products.add(product);
        System.out.println("Товар закуплен на склад.");
    }

    // Метод для найма сотрудника на складе
    public void hireEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Новый сотрудник нанят на склад.");
    }
    // Метод для увольнение  сотрудника на складе
    public void dismissEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            System.out.println("Сотрудник уволен со склада.");
        } else {
            System.out.println("Ошибка при увольнении сотрудника: сотрудник не найден.");
        }
    }

    // Метод для получения информации о складе
    public void getInfo() {
        System.out.println("Информация о складе:");
        System.out.println("Количество товаров: " + products.size());
    }

}