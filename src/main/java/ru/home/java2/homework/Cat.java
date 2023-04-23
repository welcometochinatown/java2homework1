package ru.home.java2.homework;

public class Cat implements Competitor {
    private String name;
    private int catRunDistance;
    private int catJumpHeight;

    public Cat(String name, int catRunDistance, int catJumpHeight) {
        this.name = name;
        this.catRunDistance = catRunDistance;
        this.catJumpHeight = catJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (catRunDistance >= distance) {
            System.out.println(name + " бежит");
            return true;
        }
        System.out.println(name + " дальше не бежит");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (catJumpHeight >= height) {
            System.out.println(name + " прыгнул");
            return true;
        }
        System.out.println(name + " не перепрыгнул");
        return false;
    }
}
