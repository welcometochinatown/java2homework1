package ru.home.java2.homework;

public class Robot implements Competitor {
    private int robotRunDistance = 15;
    private int robotJumpHeight = 10;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (robotRunDistance >= distance) {
            System.out.println(name + " бежит");
        } else {
            System.out.println(name + " дальше не бежит");
        }
    }

    @Override
    public void jump(int height) {
        if (robotJumpHeight >= height) {
            System.out.println(name + " прыгнул");
        } else {
            System.out.println(name + " не перепрыгнул");
        }
    }
}
