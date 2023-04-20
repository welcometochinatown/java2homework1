package ru.home.java2.homework;

public class Human implements Competitor {
    private String name;
    private int humanRunDistance;
    private int humanJumpHeight;

    public Human(String name, int humanRunDistance, int humanJumpHeight) {
        this.name = name;
        this.humanRunDistance = humanRunDistance;
        this.humanJumpHeight = humanJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (humanRunDistance >= distance) {
            System.out.println(name + " бежит");
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (humanJumpHeight >= height) {
            System.out.println(name + " прыгнул");
            return true;
        }
        return false;
    }

    @Override
    public boolean cantRun(int distance) {
        if (humanRunDistance >= distance) {
            return true;
        }
        System.out.println(name + " дальше не бежит");
        return false;
    }

    @Override
    public boolean cantJump(int height) {
        if (humanJumpHeight >= height) {
            return true;
        }
        System.out.println(name + " не перепрыгнул");
        return false;
    }
}
