package com.company.PrintAndCats;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 80) {
            System.out.println(name + "- возраст задан ошибочно");
        } else
            this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public abstract void makeSound();
}
