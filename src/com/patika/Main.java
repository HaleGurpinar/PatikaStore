package com.patika;

import com.patika.Objects.Brand;
import com.patika.Objects.Telephone;
import com.patika.Objects.Notebook;


import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> brandNames = new ArrayList<>(Arrays.asList("samsung", "lenovo", "apple", "huawei", "casper", "asus", "hp", "xiaomi", "monster"));
        List<Telephone> telephones = addTelephone();
        List<Notebook> notebooks = addNotebook();
        int select;
        boolean duration = true;
        while (duration) {
            System.out.print("\n 1 - Brand List \n 2 - Mobile Phone \n 3 - Notebook \n 4 - Add Product \n 5 - Delete Product \n 6 - Exit \n  Make a choice: ");
            select = sc.nextInt();
            switch (select) {
                case 1 -> listedBrands(brandNames);
                case 2 -> listedTelephone(telephones);
                case 3 -> listedNotebook(notebooks);
                case 4 -> addProduct(brandNames, telephones, notebooks);
                case 5 -> delete(telephones,notebooks);
                case 6 -> duration = false;
                default -> System.out.println("Please make a choice");
            }
        }

    }

    private static void delete(List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.print("Select product type,\n  1 - Mobile Phone \n  2 - Notebook \n Select: ");
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                listedTelephone(telephones);
                System.out.print("Enter mobile phone's id that you want delete: ");
                int id = sc.nextInt();
                telephones.removeIf(telephone -> telephone.getId() == id);

            }
            case 2 -> {
                listedNotebook(notebooks);
                System.out.print("Enter notebook's id that you want delete: ");
                int id = sc.nextInt();
                notebooks.removeIf(notebook -> notebook.getId() == id);

            }

        }
    }

    private static void addProduct(List<String> brandNames, List<Telephone> telephones, List<Notebook> notebooks) {
        System.out.print(" Select product type , \n  1 - Mobile Phone \n  2 - Notebook \n  Select: ");
        List<String> values = new ArrayList<>();
        int select = sc.nextInt();
        switch (select) {
            case 1 -> {
                String[] brands = new String[]{"Brand", "Model", "Price", "Discount Rate", "Stock", "Memory", "Screen Size", "Battery", "Ram", "Color"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = sc.next();
                    while (brand.equals("Brand") && !brandNames.contains(value.toLowerCase())) {
                        System.out.print(brand + "enter again" + ": ");
                        value = sc.next();
                    }
                    values.add(value);
                }
                telephones.add(new Telephone(values.get(0).toUpperCase(), values.get(1).toUpperCase(), Double.parseDouble(values.get(2)), Double.parseDouble(values.get(3)), Integer.parseInt(values.get(4)), Integer.parseInt(values.get(5)), Double.parseDouble(values.get(6)), Integer.parseInt(values.get(7)), Integer.parseInt(values.get(8)), values.get(9)));
            }
            case 2 -> {
                String[] brands = new String[]{"Brand", "Model", "Price", "Discount Rate", "Stock", "Memory", "Screen Size", "Ram"};
                for (String brand : brands) {
                    System.out.print(brand + ": ");
                    String value = sc.next();
                    while (brand.equals("Brand") && !brandNames.contains(value.toLowerCase())) {
                        System.out.print(brand + "enter again" + ": ");
                        value = sc.next();
                    }
                    values.add(value);
                }
                notebooks.add(new Notebook(values.get(0).toUpperCase(), values.get(1).toUpperCase(), Double.parseDouble(values.get(2)), Double.parseDouble(values.get(3)), Integer.parseInt(values.get(4)), Integer.parseInt(values.get(5)), Double.parseDouble(values.get(6)), Integer.parseInt(values.get(7))));
            }

        }
    }

    private static void listedBrands(List<String> brandNames) {
        List<Brand> brands = new ArrayList<>();
        for (int i = 0; i < brandNames.toArray().length; i++) {
            brands.add(new Brand(brandNames.get(i)));
        }
        Collections.sort(brands);
        for (Brand b : brands) {
            System.out.println("-" + b.getName().toUpperCase());
        }
    }

    private static List<Telephone> addTelephone() {
        List<Telephone> telephones = new ArrayList<>();

        telephones.add(new Telephone("SAMSUNG", "S20", 5000, 10, 45, 64, 15.6, 4500, 8, "Black"));
        telephones.add(new Telephone("APPLE", "14", 5000, 10, 45, 64, 15.6, 4500, 8, "Pink"));
        telephones.add(new Telephone("XIAOMI", "Red Mi Note 11", 5000, 10, 45, 64, 15.6, 4500, 8, "Red"));

        return telephones;
    }
    private static void listedTelephone(List<Telephone> telephones){
        System.out.format("%-5s %-8s %-25s %-14s %-10s %-10s %-10s %-10s\n", "|ID|", "|Brand|", "|Model|", "|Price|", "|Memory|", "|Capacity|", "|Size|", "|Color|");
        System.out.println("___________________________________________________________________________________________");
        for (Telephone t : telephones) {
            System.out.format(" %-4s %-10s %-23s %-15s %-10s %-10s %-10s %-10s\n", t.getId(), t.getBrand(), t.getDescription(), t.getUnitPrice() + " TL", t.getMemory() + " GB", t.getRam() + " GB", t.getSize()+"`", t.getColor());
        }
    }
    private static List<Notebook> addNotebook() {
        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(new Notebook("LENOVO", "Thinkpad 3", 15000, 10, 45, 512, 13.2, 24));
        notebooks.add(new Notebook("APPLE", "M2", 35000, 10, 45, 128, 16.6, 8));
        notebooks.add(new Notebook("HUAWEI", "D16", 25000, 10, 45, 1024, 15.6, 16));

        return notebooks;
    }

    private static void listedNotebook(List<Notebook> notebooks){
        System.out.format("%-5s %-8s %-22s %-11s %-10s %-10s %-10s\n", "|ID|", "|Brand|", "|Model|", "|Price|", "|Memory|", "|Capacity|", "|Size|");
        System.out.println("______________________________________________________________________________________________");
        for (Notebook n : notebooks) {
            System.out.format(" %-4s %-8s %-21s %-13s %-10s %-10s %-10s\n", n.getId(), n.getBrand(), n.getDescription(), n.getUnitPrice() + " TL", n.getMemory() + " GB", n.getRam() + " GB", n.getSize() + "`");
        }
    }

}
