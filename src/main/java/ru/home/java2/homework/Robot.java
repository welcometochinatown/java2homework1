package ru.home.java2.homework;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Робот бежит");
    }
    public void jump() {
        System.out.println("Робот прыгнул");
    }
}
