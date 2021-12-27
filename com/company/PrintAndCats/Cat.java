package com.company.PrintAndCats;

public class Cat extends Animal implements InfoMethodMovement {

    public Cat(String name, int age) {
        super(name, age);
    }

    int runningSpeed = 30;

    @Override
    public void setAge(int age) {
        if (age < 0 || age > 40) {
            System.out.println(name + "- возраст кошки задан ошибочно");
        } else
            this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.print("cat make sound Meow \n");
    }

    public void methodOfMovement() {
        System.out.print("cat running speed is " + this.runningSpeed + "km/h\n");
    }


}

