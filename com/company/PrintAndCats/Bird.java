package com.company.PrintAndCats;

public class Bird extends Animal implements InfoMethodMovement {
    private boolean flying = true;

    public Bird(String name, int age, boolean flying) {
        super(name, age);
        this.flying = flying;
    }

    @Override
    public void makeSound() {
        System.out.print("Bird make sound \"chik-chirik\"\n");
    }


    public void movement() {
        if (this.flying) {
            System.out.println("method of movement bird - flying\n");
        } else System.out.println("bird cannot fly\n");
    }
}
