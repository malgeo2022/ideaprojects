package com.example.demo.test;

import java.util.Scanner;

public class Console {
    private static RepairController repairController = new RepairController();

    public static void main(String[] args) {
        int choice = -1;

        while(choice != 0) {
            while (choice < 0 || choice > 2) {
                printMenu();
                choice = readChoice();
            }

            switch (choice) {
                case 1:
                    repairController.printMenu();
                    break;
                case 2:
                    System.out.println("do Service");
                    break;
                default:
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("---------- MAIN MENU ----------");
        System.out.println("Choose number:");
        System.out.println("");
        System.out.println("1. Repair");
        System.out.println("2. Service");
        System.out.println("0. Exit");
    }

    private static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
