package ru.home.java2.homework;

public class Robot implements Competitor {
    private String name;
    private int robotRunDistance;
    private int robotJumpHeight;

    public Robot(String name, int robotRunDistance, int robotJumpHeight) {
        this.name = name;
        this.robotRunDistance = robotRunDistance;
        this.robotJumpHeight = robotJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (robotRunDistance >= distance) {
            System.out.println(name + " бежит");
            return true;
        }
        System.out.println(name + " дальше не бежит");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (robotJumpHeight >= height) {
            System.out.println(name + " прыгнул");
            return true;
        }
        System.out.println(name + " не перепрыгнул");
        return false;
    }
}
