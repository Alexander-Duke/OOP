package com.company.PrintAndCats;

public class Printer {
    String greeting;

    public void printCat(Cat cat) {
        System.out.println(greeting + cat.age + " years old " + cat.name);

    }

    //todo: create method that takes two arguments Cat and greeting message, and prints greeting message with cat name

}
