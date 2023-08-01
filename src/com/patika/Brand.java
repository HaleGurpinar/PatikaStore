package com.patika;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class Brand implements Comparable<Brand>{

    private String name;
    private  int id;
    private static String[] brands = new String[9];
    private static LinkedHashMap<String, Integer> nameId= new LinkedHashMap<>();
    private  Product product;

    @Override
    public int compareTo(Brand o) {

        return getName().compareTo(o.getName());
    }

    public Brand() {
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



    public void printBrands(){
        compare(brands);

        for (String b: brands){
            System.out.println("-" + brands);
        }
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
