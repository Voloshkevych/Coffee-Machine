package com.hyperskill;


public class Machine {


    enum Espresso {
        WATER(250),
        MILK(0),
        BEANS(16),
        COST(4);

        private final int item;
        Espresso(int item){
            this.item = item;
        }
        public int getItem(){ return item;}
    }

    enum Latte {
        WATER(350),
        MILK(75),
        BEANS(20),
        COST(7);

        private final int item;
        Latte(int item){
            this.item = item;
        }
        public int getItem(){ return item;}
    }

    enum Cappuccino {
        WATER(200),
        MILK(100),
        BEANS(12),
        COST(6);

        private final int item;
        Cappuccino(int item){
            this.item = item;
        }
        public int getItem(){ return item;}
    }

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public Machine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void getRemains() {

        System.out.println();
        System.out.print("The coffee machine has:\n");
        System.out.printf("%d of water\n", water);
        System.out.printf("%d of milk\n", milk);
        System.out.printf("%d of coffee beans\n", beans);
        System.out.printf("%d of disposable cups\n", cups);
        System.out.printf("%d of money\n", money);
        System.out.println();
    }

    public void doEspresso() {
        if (water >= Espresso.WATER.getItem()) {
            water = water - Espresso.WATER.getItem();
        } else {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (milk >= Espresso.MILK.getItem()) {
            milk = milk - Espresso.MILK.getItem();
        } else {
            System.out.println("Sorry, not enough milk!\n");
            return;
        }
        if (beans >= Espresso.BEANS.getItem()) {
            beans = beans - Espresso.BEANS.getItem();
        } else {
            System.out.println("Sorry, not enough beans!\n");
            return;
        }
        if (cups > 0) {
            cups = cups - 1;
        } else {
            System.out.println("Sorry, not enough cups!\n");
            return;
        }
        money = money + Espresso.COST.getItem();
        System.out.println("I have enough resources, making you a coffee!\n");
    }

    public void doLatte() {
        if (water >= Latte.WATER.getItem()) {
            water = water - Latte.WATER.getItem();
        } else {
            System.out.println("Sorry, not enough water!\n");
            return;
        }
        if (milk >= Latte.MILK.getItem()) {
            milk = milk - Latte.MILK.getItem();
        } else {
            System.out.println("Sorry, not enough milk!\n");
            return;
        }
        if (beans >= Latte.BEANS.getItem()) {
            beans = beans - Latte.BEANS.getItem();
        } else {
            System.out.println("Sorry, not enough beans!\n");
            return;
        }
        if (cups > 0) {
            cups = cups - 1;
        } else {
            System.out.println("Sorry, not enough cups!\n");
            return;
        }
        money = money + Latte.COST.getItem();
        System.out.println("I have enough resources, making you a coffee!\n");
    }

    public void doCappuccino() {
        if (water >= Cappuccino.WATER.getItem()) {
            water = water - Cappuccino.WATER.getItem();
        } else {
            System.out.println("Sorry, not enough water!\n");
            return;
        }
        if (milk >= Cappuccino.MILK.getItem()) {
            milk = milk - Cappuccino.MILK.getItem();
        } else {
            System.out.println("Sorry, not enough milk!\n");
            return;
        }
        if (beans >= Cappuccino.BEANS.getItem()) {
            beans = beans - Cappuccino.BEANS.getItem();
        } else {
            System.out.println("Sorry, not enough beans!\n");
            return;
        }
        if (cups > 0) {
            cups = cups - 1;
        } else {
            System.out.println("Sorry, not enough cups!\n");
            return;
        }
        money = money + Cappuccino.COST.getItem();
        System.out.println("I have enough resources, making you a coffee!\n");
    }
}
