package Warehouse;

import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Warehouse> warehouses;
    private List<SalesPoint> salesPoints;
    public Company() {
        this.warehouses = new ArrayList<>();
        this.salesPoints = new ArrayList<>();
    }

    // Метод для открытия нового склада
    public void openNewWarehouse() {
        Warehouse newWarehouse = new Warehouse();
        warehouses.add(newWarehouse);
        System.out.println("Открыт новый склад.");
    }

    // Метод для закрытия склада по индексу
    public void closeWarehouse(int index) {
        if (index >= 0 && index < warehouses.size()) {
            warehouses.remove(index);
            System.out.println("Склад " + index + " закрыт.");
        } else {
            System.out.println("Неверный индекс склада.");
        }
    }
    // Метод для открытия нового пункта продаж
    public void openSalesPoint() {
        SalesPoint newSalesPoint = new SalesPoint();
        salesPoints.add(newSalesPoint);
        System.out.println("Открыт новый пункт продаж.");
    }

    // Метод для закрытия пункта продаж по индексу
    public void closeSalesPoint(int index) {
        if (index >= 0 && index < salesPoints.size()) {
            salesPoints.remove(index);
            System.out.println("Пункт продаж " + index + " закрыт.");
        } else {
            System.out.println("Неверный индекс пункта продаж.");
        }
    }

}