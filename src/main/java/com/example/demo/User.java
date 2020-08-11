package com.example.demo;

import java.util.Random;

public class User {
    int money;
    static boolean black;

    public User() {
    }

    public User(boolean black) {
            Random random = new Random(1000);
           money = random.nextInt();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "money=" + money +
                '}';
    }
}
