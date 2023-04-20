package ru.home.java2.homework;

public class Wall implements Barrier {
    @Override
    public void make(Competitor competitor) {
        competitor.jump();
    }
}
