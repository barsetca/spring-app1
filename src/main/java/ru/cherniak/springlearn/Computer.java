package ru.cherniak.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + "\n" + musicPlayer.playMusic(TypeMusic.ROCK)
                + "\n" + musicPlayer.playMusic(TypeMusic.RAP) + "\n" + musicPlayer.playMusic(TypeMusic.CLASSIC);
    }
}
