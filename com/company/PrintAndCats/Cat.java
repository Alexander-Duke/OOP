package com.company.PrintAndCats;

public class Cat {
    private String name;
    private int age;
    public Cat() {
        this.name = "noName";
        this.age = 0;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("присвоено пустое имя");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 50) {
            System.out.println(name + "- возраст задан ошибочно");
        } else {
            this.age = age;
        }

    }
}
