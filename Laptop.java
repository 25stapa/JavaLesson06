package Lesson06;

public class Laptop {
    private String brand; // Марка ноутбука
    private String model; // Модель ноутбука
    private int ramSize; // Размер оперативной памяти в гигабайтах
    private double screenSize; // Размер экрана в дюймах
    private String color; // Цвет ноутбука
    private double price; // Цена ноутбука
    private final String operatingSystem; // Operating system

    public Laptop(String brand, String model, int ramSize, double screenSize,
                  String color, String operatingSystem, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    // Геттеры и сеттеры для всех полей

    public String getBrand() {return brand;}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для вывода информации о ноутбуке
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM size: " + ramSize + " Gb");
        System.out.println("Screen size: " + screenSize + "\"");
        System.out.println("Color: " + color);
        System.out.println("Operating system:  " + operatingSystem);
        System.out.println("Price: " + price + " rub.");
        System.out.println();
    }
}





