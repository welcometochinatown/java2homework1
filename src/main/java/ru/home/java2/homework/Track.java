package ru.home.java2.homework;

public class Track implements Barrier {
    @Override
    public void make(Competitor competitor) {
        competitor.run();
    }
}
