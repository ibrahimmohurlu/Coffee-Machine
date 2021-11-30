package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CoffeeMachineController controller = new CoffeeMachineController(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = scanner.nextLine();
            switch (choice) {
                case "exit":
                    flag = false;
                    break;
                case "remaining":
                    controller.printState();
                    break;
                case "buy":
                    controller.buy();
                    break;
                case "fill":
                    controller.fill();
                    break;
                case "take":
                    controller.take();
                    break;
                default:
                    System.out.println("Error:Wrong input!");
            }
        }
    }
}
