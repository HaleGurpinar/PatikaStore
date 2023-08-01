package com.patika;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class Brand implements Comparable<Brand>{

    private String brandName;
    private  int id;
    private static String[] brands = new String[9];
    private static LinkedHashMap<String, Integer> nameId= new LinkedHashMap<>();
    private  Product product;

    @Override
    public int compareTo(Brand o) {

        return getBrandName().compareTo(brandName);
    }

    public Brand() {
    }

    public Brand(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getId() {
        return id;
    }



    public static void printBrands(){
        System.out.println();
        System.out.println("BRANDS");
        System.out.println("----------------------------");
        for (String brand : brands) {
            System.out.println("- " + brand);
        }
        System.out.println();

    }

    private static void compare(String[] brands) {
        for (int i = 0; i < brands.length; i++) {
            String first = brands[i];
            int index = i;
            for (int j = i + 1; j < brands.length; j++) {
                int result = first.compareTo(brands[j]);
                if (result > 0) {
                    first = brands[j];
                    index = j;
                }
            }
            String temp = brands[i];
            brands[i] = first;
            brands[index] = temp;

        }
    }

    public static void addBrand(String brand, int index) {
        brands[index] = brand;
        nameId.put(brand, (index + 1));

    }
}
