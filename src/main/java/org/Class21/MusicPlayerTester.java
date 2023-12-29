package org.Class21;

public class MusicPlayerTester {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.setCurrentTrack("Song1.mp3");
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        System.out.println();

        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCurrentTrack("Track2");
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        System.out.println();

        CDPlayer.StreamingPlayer streamingPlayer = new CDPlayer.StreamingPlayer();
        streamingPlayer.setCurrentTrack("LiveConcert");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}

