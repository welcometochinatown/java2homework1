package ru.home.java2.homework;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Человек бежит");
    }
    public void jump() {
        System.out.println("Человек прыгнул");
    }
}
