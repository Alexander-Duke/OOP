package com.company.GuessGame;

public class Player {
    public int number = 0;

    public void guess() {
        number = (int) (Math.random()*10);
        System.out.println("Думаю это число " + number);
    }
}