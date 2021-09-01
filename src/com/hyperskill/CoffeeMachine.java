package com.hyperskill;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int[] water = new int[1];
        water[0] = 400;
        int[] milk = new int[1];
        milk[0] = 540;
        int[] beans = new int[1];
        beans[0] = 120;
        int[] disposableCups = new int[1];
        disposableCups[0] = 9;
        int[] money = new int[1];
        money[0] = 550;

        boolean[] off = new boolean[1];
        boolean[] backToMenu = new boolean[1];

        do {
            menu(off, backToMenu, water, milk, beans, disposableCups, money);
        } while (!off[0]) ;
    }

    public static void menu(boolean[] off, boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        while (!off[0]) {
            Scanner read = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = read.nextLine();
            backToMenu[0] = false;

            do {
                switch (action) {
                    case "buy":
                        buy(off, backToMenu, water, milk, beans, disposableCups, money);
                        break;
                    case "fill":
                        fill(off, backToMenu, water, milk, beans, disposableCups, money);
                        break;
                    case "take":
                        take(off, backToMenu, water, milk, beans, disposableCups, money);
                        break;
                    case "remaining":
                        remaining(off, backToMenu, water, milk, beans, disposableCups, money);
                        break;
                    case "exit":
                        off[0] = true;
                        System.exit(0);
                        break;
                }
            } while (!off[0]);
        }
    }

    public static void  remaining(boolean[] off, boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        while (!off[0]) {
            while (!backToMenu[0]) {
                System.out.println("The coffee machine has:");
                System.out.printf("%d ml of water", water[0]);
                System.out.printf("%n%d ml of milk", milk[0]);
                System.out.printf("%n%d g of coffee beans", beans[0]);
                System.out.printf("%n%d disposable cups", disposableCups[0]);
                System.out.printf("%n$%d of money%n", money[0]);

                backToMenu[0] = true;
                menu(off, backToMenu, water, milk, beans, disposableCups, money);
            }
        }
    }

    public static void buy(boolean[] off, boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner read = new Scanner(System.in);
        String choiceOfCoffee = read.nextLine();

        switch (choiceOfCoffee) {
            case "1":
                espresso(off, backToMenu, water, milk, beans, disposableCups, money);
                break;
            case "2":
                latte(off, backToMenu, water, milk, beans, disposableCups, money);
                break;
            case "3":
                cappuccino(off, backToMenu, water, milk, beans, disposableCups, money);
                break;
            case "back":
                menu(off, backToMenu, water, milk, beans, disposableCups, money);
                break;
        }
    }

    public static void espresso(boolean[] off, boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        if (water[0] < 250) {
            System.out.println("Sorry, not enough water");
        } else if (beans[0] < 16) {
            System.out.println("Sorry, not enough coffee beans");
        } else if (disposableCups[0] < 1) {
            System.out.println("Sorry, not enough disposable cups");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water[0] -= 250;
            beans[0] -= 16;
            disposableCups[0]--;
            money[0] += 4;
        }
        menu(off, backToMenu, water, milk, beans, disposableCups, money);
    }

    public static void latte(boolean[] off, boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        if (water[0] < 350) {
            System.out.println("Sorry, not enough water");
        } else if (milk[0] < 75) {
            System.out.println("Sorry, not enough milk");
        } else if (beans[0] < 20) {
            System.out.println("Sorry, not enough coffee beans");
        } else if (disposableCups[0] < 1) {
            System.out.println("Sorry, not enough disposable cups");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water[0] -= 350;
            milk[0] -= 75;
            beans[0] -= 20;
            disposableCups[0]--;
            money[0] += 7;
        }
        menu(off, backToMenu, water, milk, beans, disposableCups, money);
    }

    public static void cappuccino(boolean[] off, boolean[] backToMenu, int[] water,int[] milk, int[] beans, int[] disposableCups, int[] money) {
        if (water[0] < 200) {
            System.out.println("Sorry, not enough water");
        } else if (milk[0] < 100) {
            System.out.println("Sorry, not enough milk");
        } else if (beans[0] < 12) {
            System.out.println("Sorry, not enough coffee beans");
        } else if (disposableCups[0] < 1) {
            System.out.println("Sorry, not enough disposable cups");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water[0] -= 200;
            milk[0] -= 100;
            beans[0] -= 12;
            disposableCups[0]--;
            money[0] += 6;
        }
        menu(off, backToMenu, water, milk, beans, disposableCups, money);
    }

    public static void fill(boolean[] off,boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        Scanner read = new Scanner(System.in);

        while (!backToMenu[0]) {
            System.out.println("Write how many ml of water you want to add:");
            water[0] += read.nextInt();

            System.out.println("Write how many ml of milk you want to add:");
            milk[0] += read.nextInt();

            System.out.println("Write how many grams of coffee beans you want to add:");
            beans[0] += read.nextInt();

            System.out.println("Write how many disposable cups of coffee you want to add?");
            disposableCups[0] += read.nextInt();
            backToMenu[0] = true;
            menu(off, backToMenu, water, milk,beans,disposableCups, money);
        }
    }

    public static void take(boolean[] off, boolean[] backToMenu, int[] water, int[] milk, int[] beans, int[] disposableCups, int[] money) {
        while (!backToMenu[0]) {
            System.out.printf("I gave you $%d%n", money[0]);
            money[0] = 0;
            backToMenu[0] = true;
            menu(off, backToMenu, water, milk, beans, disposableCups, money);
        }
    }

}