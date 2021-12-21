package com.company.PrintAndCats;

public class Main {
    public static void main(String[] args) {
        final Cat redCat = new Cat("Barsik", 90);

        final Cat blackCat = new Cat("Murka", 3);

       Printer p = new Printer();

        System.out.println(blackCat);
        System.out.println(redCat);

        p.printCat(blackCat);
        p.printCat(redCat);
        p.printCatWithGreeting(blackCat, "Hello");


    }
}
