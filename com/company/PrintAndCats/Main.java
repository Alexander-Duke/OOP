package com.company.PrintAndCats;

public class Main {
    public static void main(String[] args) {
        final Cat cat = new Cat("Barsik", 40);
        final Bird bird = new Bird("Sparrow", 3);
        Printer p = new Printer();

        System.out.println(cat);
        p.printCat(cat);
        p.printCatWithGreeting(cat, "Hello");

        outputInfoMethodOfMovement(cat);
        cat.makeSound();
        outputInfoMethodOfMovement(bird);
        bird.makeSound();
    }

    //Application of the interface
    public static void outputInfoMethodOfMovement(InfoMethodMovement info){
        info.methodOfMovement();
    }
}
