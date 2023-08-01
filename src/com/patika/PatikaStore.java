package com.patika;

import java.util.Scanner;

public class PatikaStore {


    public void run(){

        Scanner sc= new Scanner(System.in);



        System.out.println("PatikaStore Product Management Menu");
        System.out.println("1- Notebook Operations");
        System.out.println("2- Smart Phone Operations");
        System.out.println("3- List Brands");
        System.out.println("0- Exit");

        System.out.print("Your choice: ");
        int userChoice =sc.nextInt();

        String[] brands = { "Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster" };
        int index = 0;
        for (String brand : brands) {
            Brand.addBrand(brand, index++);
        }

        switch (userChoice){

            case 1:
                System.out.println("1 Notebook Operations");
                System.out.println("----------------------------------------------------------------------");
                Product.menu(1);
                break;
            case 2:
                System.out.println("2 Smart Phone Operations");
                System.out.println("----------------------------------------------------------------------");
                Product.menu(2);
                break;
            case 3:
                System.out.println("List Brands");
                System.out.println("------------");
                Brand.printBrands();
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please enter a number from panel options!!!");
                break;
        }
    }
}
