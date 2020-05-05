package ru.cherniak.springlearn;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    //for DI from setter
     private List<Music> musicList = new ArrayList<>();
     private String name;
     private int volume;

    public MusicPlayer() {
    }

    //IoC - inversion of control
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
