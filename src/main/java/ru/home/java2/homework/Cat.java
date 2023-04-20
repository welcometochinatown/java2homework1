package ru.home.java2.homework;

public class Cat implements Competitor {
    private int catRunDistance = 10;
    private int catJumpHeight = 15;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (catRunDistance >= distance) {
            System.out.println(name + " бежит");
        } else {
            System.out.println(name + " дальше не бежит");
        }
    }

    @Override
    public void jump(int height) {
        if (catJumpHeight >= height) {
            System.out.println(name + " прыгнул");
        } else {
            System.out.println(name + " не перепрыгнул");
        }
    }
}
