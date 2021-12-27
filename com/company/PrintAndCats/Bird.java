package com.company.PrintAndCats;

public class Bird extends Animal implements InfoMethodMovement {

    public Bird(String name, int age) {
        super(name, age);
    }

    private boolean flying = true;

    public void methodOfMovement() {
        if (this.flying) {
            System.out.println("method of movement bird - flying\n");
        } else System.out.println("bird cannot fly\n");
    }
}
