package ru.home.java2.homework;

public class Track implements Barrier {
    private int trackDistance;

    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    @Override
    public void make(Competitor competitor) {
        competitor.run(trackDistance);
    }
}
