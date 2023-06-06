package com.patika;

public class PatikaStore {


    public static void main(String[] args) {
        int s=0;
        System.out.println("PatikaStore Product Management Panel");

        switch (s){

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
                System.out.println("Did not select an option!!!");
        }
    }
}
