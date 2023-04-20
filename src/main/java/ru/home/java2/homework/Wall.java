package ru.home.java2.homework;

public class Wall implements Barrier {
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean make(Competitor competitor) {
        return competitor.jump(wallHeight);
    }

    @Override
    public boolean isntDoable(Competitor competitor) {
        return competitor.cantJump(wallHeight);
    }
}
