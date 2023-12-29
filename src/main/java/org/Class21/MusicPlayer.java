package org.Class21;

public class MusicPlayer {

    private String currentTrack;
    private int volume;

    public MusicPlayer() {
        this.currentTrack = "";
        this.volume = 80; // Default volume
    }

    public void play() {
        System.out.println("Playing: " + currentTrack);
    }

    public void pause() {
        System.out.println("Paused: " + currentTrack);
    }

    public void stop() {
        System.out.println("Stopped: " + currentTrack);
    }

    public void setCurrentTrack(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to: " + volume);
        } else {
            System.out.println("Invalid volume level");
        }
    }
}

// MP3Player.java
class MP3Player extends MusicPlayer {
    public MP3Player() {
        super();
    }

    // Additional methods or overrides specific to MP3Player can be added here

    @Override
    public void play() {
        System.out.println("Playing MP3: " + getCurrentTrack());
    }

    private String getCurrentTrack() {
        return null;
    }
}

