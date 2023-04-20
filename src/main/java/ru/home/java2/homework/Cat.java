package ru.home.java2.homework;

public class Cat implements CanRunAndJump {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул");
    }
}
