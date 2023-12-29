package org.Class21;

// CDPlayer.java
public class CDPlayer extends MusicPlayer {
    public CDPlayer() {
        super();
    }

    // Additional methods or overrides specific to CDPlayer can be added here

    @Override
    public void play() {
        System.out.println("Playing CD: " + getCurrentTrack());
    }

    private static String getCurrentTrack() {

        return null;
    }

// StreamingPlayer.java
public static class StreamingPlayer extends MusicPlayer {
    public StreamingPlayer() {
        super();
    }

    // Additional methods or overrides specific to StreamingPlayer can be added here

    @Override
    public void play() {
        System.out.println("Streaming: " + getCurrentTrack() + " from the internet.");
    }
}
}
