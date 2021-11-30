package com.company;

import java.util.Scanner;

public class CoffeeMachineController {
    public int mlOfWater;
    public int mlOfMilk;
    public int grOfBeans;
    public int disposableCups;
    public int collectedMoney;

    public Scanner scanner = new Scanner(System.in);


    public CoffeeMachineController(int water, int milk, int beans, int cups, int money) {
        this.mlOfWater = water;
        this.mlOfMilk = milk;
        this.grOfBeans = beans;
        this.disposableCups = cups;
        this.collectedMoney = money;
    }

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                if (mlOfWater < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (grOfBeans < 16) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlOfWater -= 250;
                    mlOfMilk -= 0;
                    grOfBeans -= 16;
                    collectedMoney += 4;
                    disposableCups -= 1;
                    break;
                }

            case "2":
                if (mlOfWater < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (mlOfMilk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (grOfBeans < 20) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlOfWater -= 350;
                    mlOfMilk -= 75;
                    grOfBeans -= 20;
                    collectedMoney += 7;
                    disposableCups -= 1;
                    break;
                }
            case "3":
                if (mlOfWater < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (mlOfMilk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (grOfBeans < 12) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlOfWater -= 200;
                    mlOfMilk -= 100;
                    grOfBeans -= 12;
                    collectedMoney += 6;
                    disposableCups -= 1;
                    break;
                }

            case "back":
                break;
        }
    }

    public void take() {
        System.out.println(String.format("I gave you $%d", collectedMoney));
        collectedMoney = 0;
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add:");
        mlOfWater += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        mlOfMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        grOfBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        disposableCups += scanner.nextInt();
    }

    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(String.format("%d ml of water", mlOfWater));
        System.out.println(String.format("%d ml of milk", mlOfMilk));
        System.out.println(String.format("%d g of coffee beans", grOfBeans));
        System.out.println(String.format("%d disposable cups", disposableCups));
        System.out.println(String.format("$%d of money", collectedMoney));
    }
}


