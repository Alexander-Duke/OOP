package com.company.PrintAndCats;

public class Main {
    public static void main(String[] args) {
        Cat redCat = new Cat();
        redCat.name = "Barsik";
        redCat.age = 1;

        Cat blackCat = new Cat();
        blackCat.name = "Murka";
        blackCat.age = 3;


        Printer p = new Printer();

        p.printCat(blackCat);
        p.printCat(redCat);
        p.printCatWithGreeting(blackCat,"Hello");

//изучить паттерн singletone
        // конструктор без параметров и с параметрами

        // что такое свойства объектов (как происходит инициализация объектов?)

        //как на принтере напечатать любой тип данных

    }
}
