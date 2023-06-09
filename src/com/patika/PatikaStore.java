package com.patika;

import java.util.Scanner;

public class PatikaStore {


    public void menu(){

        Scanner sc= new Scanner(System.in);

        System.out.println("PatikaStore Product Management Menu");
        System.out.println("1- Notebook Operations");
        System.out.println("2- Smart Phone Operations");
        System.out.println("3- ist Brands");
        System.out.println("0- Exit");

        System.out.print("Your choice: ");
        int userChoice =sc.nextInt();

        switch (userChoice){

            case 1:
                System.out.println("Notebook Operations");
                    break;
            case 2:
                System.out.println("Smart Phone Operations");
                break;
            case 3:
                System.out.println("List Brands");
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
