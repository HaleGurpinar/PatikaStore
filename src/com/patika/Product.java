package com.patika;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Product {

    static Scanner scanner= new Scanner(System.in);
    private int id;
    private int idPhone;
    private int idNotebook;
    private double price;
    private double discountRate;
    private int stock;
    private String name;
    private String brand;
    private int memory;
    private double screen;
    private double battery;
    private double ram;
    private String color;
    private String productName;

    private static HashMap<String, ArrayList<Product>> products = new HashMap<>() {
        {
            put("Notebook", new ArrayList<Product>());
            put("MobilePhone", new ArrayList<Product>());
        }
    };

    public Product(int idPhone, int idNotebook, double price, double discountRate, int stock, String name, String brand, int memory, double screen, double battery, double ram, String color) {
        this.idPhone = idPhone;
        this.idNotebook = idNotebook;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.screen = screen;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public Product(int idPhone, int idNotebook, double price, double discountRate, int stock, String name, String brand, int memory, double screen, double battery, double ram) {
        this.idPhone = idPhone;
        this.idNotebook = idNotebook;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.screen = screen;
        this.battery = battery;
        this.ram = ram;
    }

    public static void menu(int number){
        if (number ==1){
            System.out.println("Notebook");
        }else {
            System.out.println("Mobile Phone");
        }

        System.out.println(".......................");
        System.out.println("1-List Items");
        System.out.println("2-Add Items");
        System.out.println("3-Delete Items");
        System.out.println("4-Filter Items");
        System.out.println("Make a choice");
        int select=scanner.nextInt();

        switch (select){
            case 1:
                listItems(number);
                break;
            case 2:
                //addItems(number);
                break;
            case 3:
                //deleteItems(number);
                break;
            case 4:
                //filterItems(number);
                break;
            default: {
                System.out.println("There is no such an option. Please enter your choice again.");
                menu(number);
            }
        }
    }

    public static void listItems(int number) {
        if (number % 2 != 0) {
            // Notebook
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");
            System.out.println(
                    "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | RAM        |");
            System.out.println(
                    "----------------------------------------------------------------------------------------------------------");

            ArrayList<Product> productList = products.get("Notebook");

            if (!productList.isEmpty()) {
                for (Product product : productList) {
                    String productName = product.getName();
                    product.setName(productName);

                    System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
                            product.getId(), product.getName(), product.getPrice(), product.getName(),
                            product.getMemory(), product.getScreen(), product.getRam());
                }
                System.out.println(
                        "----------------------------------------------------------------------------------------------------------");
            }
            System.out.println();

        } else {
            // Mobile phone
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(
                    "| ID | Product Name                   | Price      | Brand      | Storage    | Screen Size  | Camera     | Battery    | RAM        | COLOR      |");
            System.out.println(
                    "-------------------------------------------------------------------------------------------------------------------------------------------------");

            ArrayList<Product> productList = products.get("MobilePhone");

            if (!productList.isEmpty()) {
                for (Product product : productList) {
                    String productName = product.getName();
                    product.setProductName(productName);

                    System.out.printf(
                            "| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s | %-10s |\n",
                            product.getId(), product.getName(), product.getPrice(), product.getName(),
                            product.getMemory(), product.getScreen(), product.getBattery(), product.getRam(),
                            product.getColor());
                }
                System.out.println(
                        "-------------------------------------------------------------------------------------------------------------------------------------------------");

            }
            System.out.println();

        }
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(int idPhone) {
        this.idPhone = idPhone;
    }

    public  int getIdNotebook() {
        return idNotebook;
    }

    public void setIdNotebook(int idNotebook) {
        this.idNotebook = idNotebook;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
