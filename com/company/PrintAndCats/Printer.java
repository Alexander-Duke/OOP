package com.company.PrintAndCats;

public class Printer {
    String greeting;

    public void printCat(Cat cat) {
        System.out.println(greeting + cat.age + " years old " + cat.name);

    }

}
