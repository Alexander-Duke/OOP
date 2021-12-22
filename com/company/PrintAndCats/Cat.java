package com.company.PrintAndCats;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void setAge(int age) {
        if (age < 0 || age > 40) {
            System.out.println(name + "- возраст кошки задан ошибочно");
        } else
            this.age = age;
    }
///
}

