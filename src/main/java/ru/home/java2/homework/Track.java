package ru.home.java2.homework;

public class Track implements Barrier {
    private final int trackDistance;

    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    @Override
    public boolean make(Competitor competitor) {
        return competitor.run(trackDistance);
    }
}
