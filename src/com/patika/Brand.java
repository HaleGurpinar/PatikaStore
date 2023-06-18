package com.patika;

import java.util.Set;
import java.util.TreeSet;

public class Brand implements Comparable<Brand>{
    @Override
    public int compareTo(Brand o) {
        return getName().compareTo(o.getName());
    }

    private String name;
    private  int id;
    private static int count=1;

    public static Set<Brand> brand = new TreeSet<>();

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    static {
        Brand.brand.add(new Brand("Samsung"));
        Brand.brand.add(new Brand("Lenovo"));
        Brand.brand.add(new Brand("Apple"));
        Brand.brand.add(new Brand("Huawei"));
        Brand.brand.add(new Brand("Casper"));
        Brand.brand.add(new Brand("Asus"));
        Brand.brand.add(new Brand("HP"));
        Brand.brand.add(new Brand("Xiaomi"));
        Brand.brand.add(new Brand("Monster"));

    }

    public void printBrands(){
        for (Brand b: brand){
            System.out.println(b.getName());
        }
    }
}
