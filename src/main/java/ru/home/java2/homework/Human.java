package ru.home.java2.homework;

public class Human implements Competitor {
    private int humanRunDistance = 5;
    private int humanJumpHeight = 5;
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (humanRunDistance >= distance) {
            System.out.println(name + " бежит");
        } else {
            System.out.println(name + " дальше не бежит");
        }
    }

    @Override
    public void jump(int height) {
        if (humanJumpHeight >= height) {
            System.out.println(name + " прыгнул");
        } else {
            System.out.println(name + " не перепрыгнул");
        }
    }
}
