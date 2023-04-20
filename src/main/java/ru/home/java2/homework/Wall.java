package ru.home.java2.homework;

public class Wall implements Barrier {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public void make(Competitor competitor) {
        competitor.jump(wallHeight);
    }
}
