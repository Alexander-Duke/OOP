package com.company.PrintAndCats;

public class Printer {

    public void printCat(Cat cat) {
        System.out.println(cat.age + " years old " + cat.name);

    }

    public void printCatWithGreeting(Cat cat, String greeting){
        System.out.println(greeting + " " + cat.name);
    }

    //todo: create method that takes two arguments Cat and greeting message, and prints greeting message with cat name

}
