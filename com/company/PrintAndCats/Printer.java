package com.company.PrintAndCats;

public class Printer {

    public void printCat(Cat cat) {
        System.out.println(cat.getAge() + " years old " + cat.getName());
    }

    public void printCatWithGreeting(Cat cat, String greeting) {
        System.out.printf("%s %s.\n", greeting, cat.getName());
    }
}
