package com.company.PrintAndCats;

public class Main {
    public static void main(String[] args) {
        Cat redCat = new Cat("Barsik", 1);

        Cat blackCat = new Cat("Murka", 3);

        Printer p = new Printer();

        p.printCat(blackCat);
        p.printCat(redCat);
        p.printCatWithGreeting(blackCat, "Hello");
    }
}
