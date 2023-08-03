package com.patika.Product;

//package com.patika;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class com.patika.Abstraction.Product {
//
//    static Scanner scanner= new Scanner(System.in);
//    private int id;
//    private static int idPhone;
//    private static int idNotebook;
//    private static double price;
//    private static double discountRate;
//    private static int stock;
//    private static String name;
//    private static String brand;
//    private static int memory;
//    private static double screen;
//    private static double battery;
//    private static double ram;
//    private static String color;
//    private String productName;
//
//    private static HashMap<String, ArrayList<com.patika.Abstraction.Product>> products = new HashMap<>() {
//        {
//            put("Notebook", new ArrayList<com.patika.Abstraction.Product>());
//            put("MobilePhone", new ArrayList<com.patika.Abstraction.Product>());
//        }
//    };
//
//    public com.patika.Abstraction.Product(int idPhone, int idNotebook, double price, double discountRate, int stock, String name, String brand, int memory, double screen, double battery, double ram, String color) {
//        this.idPhone = idPhone;
//        this.idNotebook = idNotebook;
//        this.price = price;
//        this.discountRate = discountRate;
//        this.stock = stock;
//        this.name = name;
//        this.brand = brand;
//        this.memory = memory;
//        this.screen = screen;
//        this.battery = battery;
//        this.ram = ram;
//        this.color = color;
//    }
//
//    public com.patika.Abstraction.Product(int idPhone, int idNotebook, double price, double discountRate, int stock, String name, String brand, int memory, double screen, double battery, double ram) {
//        this.idPhone = idPhone;
//        this.idNotebook = idNotebook;
//        this.price = price;
//        this.discountRate = discountRate;
//        this.stock = stock;
//        this.name = name;
//        this.brand = brand;
//        this.memory = memory;
//        this.screen = screen;
//        this.battery = battery;
//        this.ram = ram;
//    }
//
//    public static void menu(int number){
//        if (number ==1){
//            System.out.println("Notebook");
//        }else {
//            System.out.println("Mobile Phone");
//        }
//
//        System.out.println(".......................");
//        System.out.println("1-List Items");
//        System.out.println("2-Add Items");
//        System.out.println("3-Delete Items");
//        System.out.println("4-Filter Items");
//        System.out.println("Make a choice");
//        int select=scanner.nextInt();
//
//        switch (select){
//            case 1:
//                listItems(number);
//                break;
//            case 2:
//                addItems(number);
//                break;
//            case 3:
//                deleteItems(number);
//                break;
//            case 4:
//                filterItems(number);
//                break;
//            default: {
//                System.out.println("There is no such an option. Please enter your choice again.");
//                menu(number);
//            }
//        }
//    }
//
//    public static void listItems(int number) {
//        if (number % 2 != 0) {
//            // Notebook
//            System.out.println(
//                    "----------------------------------------------------------------------------------------------------------");
//            System.out.println(
//                    "| ID | com.patika.Abstraction.Product Name                   | Price      | com.patika.Objects.Brand      | Storage    | Screen Size  | RAM        |");
//            System.out.println(
//                    "----------------------------------------------------------------------------------------------------------");
//
//            ArrayList<com.patika.Abstraction.Product> productList = products.get("Notebook");
//
//            if (!productList.isEmpty()) {
//                for (com.patika.Abstraction.Product product : productList) {
//                    String productName = product.getName();
//                    product.setName(productName);
//
//                    System.out.format("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s |\n",
//                            product.getId(), product.getName(), product.getPrice(), product.getBrand(),
//                            product.getMemory(), product.getScreen(), product.getRam());
//                }
//                System.out.println(
//                        "----------------------------------------------------------------------------------------------------------");
//            }
//            System.out.println();
//
//        } else {
//            // Mobile phone
//            System.out.println(
//                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
//            System.out.println(
//                    "| ID | com.patika.Abstraction.Product Name                   | Price      | com.patika.Objects.Brand      | Storage    | Screen Size  | Camera     | Battery    | RAM        | COLOR      |");
//            System.out.println(
//                    "-------------------------------------------------------------------------------------------------------------------------------------------------");
//
//            ArrayList<com.patika.Abstraction.Product> productList = products.get("MobilePhone");
//
//            if (!productList.isEmpty()) {
//                for (com.patika.Abstraction.Product product : productList) {
//                    String productName = product.getName();
//                    product.setProductName(productName);
//
//                    System.out.printf(
//                            "| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-12s | %-10s | %-10s | %-10s | %-10s  |%-10s |\n",
//                            product.getId(), product.getName(), product.getPrice(), product.getBrand(),
//                            product.getMemory(), product.getScreen(), product.getBattery(), product.getRam(),
//                            product.getColor());
//                }
//                System.out.println(
//                        "-------------------------------------------------------------------------------------------------------------------------------------------------");
//
//            }
//            System.out.println();
//
//        }
//    }
//    public static void addItems(int number) {
//        System.out.print("Unit Price: ");
//        double unitPricescascanner = scanner.nextDouble();
//        System.out.print("Discount Rate: ");
//        double discountRatescascanner = scanner.nextDouble();
//        System.out.print("Stock: ");
//        int stockscascanner = scanner.nextInt();
//        System.out.print("com.patika.Objects.Brand: ");
//        String brandscascanner = scanner.next();
//        scanner.nextLine();
//        System.out.print("Model: ");
//        String modelscascanner = scanner.nextLine();
//        System.out.print("Storage: ");
//        int storagescascanner = scanner.nextInt();
//        System.out.print("Screen Size: ");
//        double screenSizescascanner = scanner.nextDouble();
//        System.out.print("RAM: ");
//        int RAMscascanner = scanner.nextInt();
//
//        if (number % 2 != 0) {
//            // Notebook
//            idNotebook += 1;
//            int id = idNotebook;
//
//            com.patika.Abstraction.Product newNotebook = new com.patika.Abstraction.Product(idPhone, idNotebook, price, discountRate, stock, name, brand, memory,
//                    screen, battery, ram);
//            products.get("Notebook").add(newNotebook);
//
//        } else {
//            // Mobile Phone
//            idPhone += 1;
//            int id = idPhone;
//            System.out.print("Camera: ");
//            int camerascascanner = scanner.nextInt();
//            System.out.print("Battery Capacity: ");
//            int batteryscascanner = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("Color: ");
//            String colorscascanner = scanner.nextLine();
//
//            com.patika.Abstraction.Product newMobilePhone = new com.patika.Abstraction.Product(idPhone, idNotebook, price, discountRate, stock, name, brand, memory,
//                    screen, battery, ram, color);
//            products.get("MobilePhone").add(newMobilePhone);
//
//        }
//    }
//
//    public static void deleteItems(int number) {
//        System.out.print("Enter an ID value to delete: ");
//        int idProduct = scanner.nextInt();
//        boolean notExist = true;
//        if (number % 2 != 0) {
//            for (com.patika.Abstraction.Product product : products.get("Notebook")) {
//                if (product.getId() == idProduct) {
//                    products.get("Notebook").remove(product);
//                    notExist = false;
//                    System.out.println("The product with ID " + idProduct + " has been removed from the system.");
//                    break;
//                }
//            }
//
//        } else {
//            for (com.patika.Abstraction.Product product : products.get("MobilePhone")) {
//                if (product.getId() == idProduct) {
//                    products.get("MobilePhone").remove(product);
//                    notExist = false;
//                    System.out.println("The product with ID " + idProduct + " has been removed from the system.");
//                    break;
//                }
//            }
//
//        }
//        if (notExist) {
//            System.out.println("The value ID is not found in the system. Please check your ID and Try again...");
//        }
//    }
//
//    public static void filterItems(int number) {
//        System.out.print("Enter an ID to filter products or '0' if you don't like to enter an ID: ");
//        int idProduct = scanner.nextInt();
//        boolean idExits = idProduct != 0;
//
//        System.out.print("Enter the brand to filter products or 'none' if you don't like to enter a brand: ");
//        String brandProduct = scanner.next();
//        boolean brandExits = !brandProduct.equals("none");
//
//        ArrayList<com.patika.Abstraction.Product> filteredProducts = new ArrayList<>();
//
//        if (number % 2 != 0) {
//            if (idExits && brandExits) {
//                for (com.patika.Abstraction.Product product : products.get("Notebook")) {
//                    if (brandProduct.equals(product.getName()) && product.getId() == idProduct) {
//                        filteredProducts.add(product);
//                        listFilteredItems(number, filteredProducts);
//                        break;
//                    } else {
//                        System.out.println(
//                                "The value ID or brand is not found in the system. Please check your ID or brand. Then Try again...");
//                        filterItems(number);
//                    }
//                }
//            } else {
//                if (brandExits) {
//                    for (com.patika.Abstraction.Product product : products.get("Notebook")) {
//                        if (brandProduct.equals(product.getName())) {
//                            filteredProducts.add(product);
//                        }
//                    }
//                    listFilteredItems(number, filteredProducts);
//                } else {
//                    System.out.println(
//                            "The brand is not found in the system. Please check your brand. Then Try again...\nATTENTION: **You must enter ID with a brand together.**");
//                    filterItems(number);
//                }
//            }
//
//        } else {
//            if (idExits && brandExits) {
//                for (com.patika.Abstraction.Product product : products.get("MobilePhone")) {
//                    if (brandProduct.equals(product.getName()) && product.getId() == idProduct) {
//                        filteredProducts.add(product);
//                        listFilteredItems(number, filteredProducts);
//                        break;
//                    } else {
//                        System.out.println(
//                                "The value ID or brand is not found in the system. Please check your ID or brand. Then Try again...");
//                        filterItems(number);
//                    }
//                }
//            } else {
//                if (brandExits) {
//                    for (com.patika.Abstraction.Product product : products.get("MobilePhone")) {
//                        if (brandProduct.equals(product.getName())) {
//                            filteredProducts.add(product);
//                        }
//                    }
//                    listFilteredItems(number, filteredProducts);
//                } else {
//                    System.out.println(
//                            "The brand is not found in the system. Please check your brand. Then Try again...\nATTENTION: **You must enter ID with a brand together.**");
//                    filterItems(number);
//                }
//            }
//        }
//    }
//
//    private static void listFilteredItems(int number, ArrayList<com.patika.Abstraction.Product> filteredProductList) {
//        if (number % 2 != 0) {
//            // Notebook
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------------");
//            System.out.println(
//                    "| ID | com.patika.Abstraction.Product Name                   | Price           | com.patika.Objects.Brand      | Storage    | Screen Size  | RAM        |");
//            System.out.println(
//                    "---------------------------------------------------------------------------------------------------------------");
//
//            if (!filteredProductList.isEmpty()) {
//                for (com.patika.Abstraction.Product product : filteredProductList) {
//                    System.out.printf("| %-2s | %-30s| %-15s TL | %-10s| %-10s| %-12s | %-10s |\n",
//                            product.getId(), product.getName(), product.getPrice(), product.getName(),
//                            product.getMemory(), product.getScreen(), product.getRam());
//                }
//                System.out.println(
//                        "---------------------------------------------------------------------------------------------------------------");
//            }
//            System.out.println();
//
//        } else {
//            // Mobile phone
//            System.out.println(
//                    "------------------------------------------------------------------------------------------------------------------------------------------------------");
//            System.out.println(
//                    "| ID | com.patika.Abstraction.Product Name                   | Price           | com.patika.Objects.Brand      | Storage    | Screen Size  | Camera     | Battery    | RAM        | COLOR      |");
//            System.out.println(
//                    "------------------------------------------------------------------------------------------------------------------------------------------------------");
//
//            if (!filteredProductList.isEmpty()) {
//                for (com.patika.Abstraction.Product product : filteredProductList) {
//                    System.out.printf(
//                            "| %-2s | %-30s| %-15s TL | %-10s| %-10s| %-10s | %-12s | %-10s | %-10s | %-10s |\n",
//                            product.getId(), product.getName(), product.getPrice(), product.getName(),
//                            product.getMemory(), product.getScreen(), product.getBattery(), product.getRam(),
//                            product.getColor());
//                }
//                System.out.println(
//                        "------------------------------------------------------------------------------------------------------------------------------------------------------");
//
//            }
//            System.out.println();
//
//        }
//    }
//
////    public String getProductName() {
////        return productName;
////    }
////
////    public void setProductName(String productName) {
////        this.productName = productName;
////    }
////
////    public  int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////
////    public int getIdPhone() {
////        return idPhone;
////    }
////
////    public void setIdPhone(int idPhone) {
////        this.idPhone = idPhone;
////    }
////
////    public  int getIdNotebook() {
////        return idNotebook;
////    }
////
////    public void setIdNotebook(int idNotebook) {
////        this.idNotebook = idNotebook;
////    }
////
////    public double getPrice() {
////        return price;
////    }
////
////    public void setPrice(double price) {
////        this.price = price;
////    }
////
////    public double getDiscountRate() {
////        return discountRate;
////    }
////
////    public void setDiscountRate(double discountRate) {
////        this.discountRate = discountRate;
////    }
////
////    public int getStock() {
////        return stock;
////    }
////
////    public void setStock(int stock) {
////        this.stock = stock;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public String getBrand() {
////        return brand;
////    }
////
////    public void setBrand(String brand) {
////        this.brand = brand;
////    }
////
////    public int getMemory() {
////        return memory;
////    }
////
////    public void setMemory(int memory) {
////        this.memory = memory;
////    }
////
////    public double getScreen() {
////        return screen;
////    }
////
////    public void setScreen(double screen) {
////        this.screen = screen;
////    }
////
////    public double getBattery() {
////        return battery;
////    }
////
////    public void setBattery(double battery) {
////        this.battery = battery;
////    }
////
////    public double getRam() {
////        return ram;
////    }
////
////    public void setRam(double ram) {
////        this.ram = ram;
////    }
////
////    public String getColor() {
////        return color;
////    }
////
////    public void setColor(String color) {
////        this.color = color;
////    }
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public static int getIdPhone() {
//        return idPhone;
//    }
//
//    public static void setIdPhone(int idPhone) {
//        com.patika.Abstraction.Product.idPhone = idPhone;
//    }
//
//    public static int getIdNotebook() {
//        return idNotebook;
//    }
//
//    public static void setIdNotebook(int idNotebook) {
//        com.patika.Abstraction.Product.idNotebook = idNotebook;
//    }
//
//    public static double getPrice() {
//        return price;
//    }
//
//    public static void setPrice(double price) {
//        com.patika.Abstraction.Product.price = price;
//    }
//
//    public static double getDiscountRate() {
//        return discountRate;
//    }
//
//    public static void setDiscountRate(double discountRate) {
//        com.patika.Abstraction.Product.discountRate = discountRate;
//    }
//
//    public static int getStock() {
//        return stock;
//    }
//
//    public static void setStock(int stock) {
//        com.patika.Abstraction.Product.stock = stock;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public static void setName(String name) {
//        com.patika.Abstraction.Product.name = name;
//    }
//
//    public static String getBrand() {
//        return brand;
//    }
//
//    public static void setBrand(String brand) {
//        com.patika.Abstraction.Product.brand = brand;
//    }
//
//    public static int getMemory() {
//        return memory;
//    }
//
//    public static void setMemory(int memory) {
//        com.patika.Abstraction.Product.memory = memory;
//    }
//
//    public static double getScreen() {
//        return screen;
//    }
//
//    public static void setScreen(double screen) {
//        com.patika.Abstraction.Product.screen = screen;
//    }
//
//    public static double getBattery() {
//        return battery;
//    }
//
//    public static void setBattery(double battery) {
//        com.patika.Abstraction.Product.battery = battery;
//    }
//
//    public static double getRam() {
//        return ram;
//    }
//
//    public static void setRam(double ram) {
//        com.patika.Abstraction.Product.ram = ram;
//    }
//
//    public static String getColor() {
//        return color;
//    }
//
//    public static void setColor(String color) {
//        com.patika.Abstraction.Product.color = color;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public static Scanner getScanner() {
//        return scanner;
//    }
//
//    public static void setScanner(Scanner scanner) {
//        com.patika.Abstraction.Product.scanner = scanner;
//    }
//
//    public static HashMap<String, ArrayList<com.patika.Abstraction.Product>> getProducts() {
//        return products;
//    }
//
//    public static void setProducts(HashMap<String, ArrayList<com.patika.Abstraction.Product>> products) {
//        com.patika.Abstraction.Product.products = products;
//    }
//}
public abstract class Product<T> implements IProduct {
    private final int id;
    private static int nextId = 1;
    private String brand;
    private double unitPrice;
    private double discount;
    private int stock;
    private String description;
    private int memory;
    private double size;
    private int ram;

    IProduct product;

    public Product(String brand, String description, double unitPrice, double discount, int stock, int memory, double size, int ram) {
        this.id = nextId;
        nextId++;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.stock = stock;
        this.description = description;
        this.memory = memory;
        this.size = size;
        this.ram = ram;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}