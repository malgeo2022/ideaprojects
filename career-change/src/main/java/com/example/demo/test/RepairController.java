package com.example.demo.test;

import java.util.Scanner;

public class RepairController {
    Scanner scanner = new Scanner(System.in);

    RepairDAO repairDAO = new RepairDAO();

    public void printMenu() {
        System.out.println("---------- Repair MENU ----------");
        System.out.println("Choose number:");
        System.out.println();
        System.out.println("1. new repair");
        System.out.println("2. find repair");
        System.out.println("3. delete repair");
        System.out.println("4. update repair");
        System.out.println("0. Exit");

        int choice = this.readChoice();
        doRepair(choice);
    }

    private void doRepair(int choice) {
        switch (choice) {
            case 1:
                createRepair();
                break;
            case 2:
                findRepair();
                break;
            case 3:
                System.out.println("Wrong choice");
                break;
            case 4:
                System.out.println("Wrong choice");
                break;
            default:

        }
    }

    private int readChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void createRepair() {
        System.out.println("Give repair id");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Give repair name");
        String name = scanner.nextLine();

        Repair repair = new Repair();
        repair.setId(id);
        repair.setName(name);

        this.repairDAO.save(repair);
        System.out.println("Repair saved");
    }

    private void findRepair() {
        System.out.println("give repair id");
        long id = scanner.nextLong();

        Repair result = this.repairDAO.find(id);

        System.out.println(result);
    }





}


