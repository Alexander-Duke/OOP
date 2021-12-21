package com.company.PrintAndCats;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void setAge(int age) {
        if (age < 0 || age > 40) {
            System.out.println(name + "- возраст задан ошибочно");
        } else
            this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", age " + age;
    }

}

