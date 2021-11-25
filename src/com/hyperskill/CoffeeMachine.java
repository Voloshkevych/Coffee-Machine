package com.hyperskill;

import java.util.Scanner;

public class CoffeeMachine {

    private static Scanner scanner;
    private static String request;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        Machine machine = new Machine(400, 540, 120, 9, 550);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            request = scanner.nextLine();
            switch (request) {
                case ("buy"):
                    buy(machine);
                    break;
                case ("fill"):
                    fill(machine);
                    break;
                case ("take"):
                    take(machine);
                    break;
                case ("remaining"):
                    getRemaining(machine);
                    break;
                case ("exit"):
                    System.exit(0);
            }
        }
    }

    public static void buy(Machine machine){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:" +
                ", back - to main menu:");
        request = scanner.nextLine();
        switch (request) {
            case ("1") :
                machine.doEspresso();
                break;
            case ("2") :
                machine.doLatte();
                break;
            case ("3") :
                machine.doCappuccino();
                break;
            case("back") :
                System.out.println();
                break;
        }
    }

    public static void fill(Machine machine) {
        System.out.println("Write how many ml of water do you want to add: ");
        machine.setWater(scanner.nextInt() + machine.getWater());
        System.out.println("Write how many ml of milk do you want to add:");
        machine.setMilk(scanner.nextInt() + machine.getMilk());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        machine.setBeans(scanner.nextInt() + machine.getBeans());
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        machine.setCups(scanner.nextInt() + machine.getCups());
        scanner.nextLine();
        System.out.println();
    }

    public static void take(Machine machine) {
        System.out.printf("I gave you $%d\n\n", machine.getMoney());
        machine.setMoney(0);
    }

    public static void getRemaining(Machine machine) {
        machine.getRemains();
    }

}