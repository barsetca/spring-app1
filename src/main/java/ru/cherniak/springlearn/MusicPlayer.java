package ru.cherniak.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component - сщздание бина
@Component
public class MusicPlayer {

//    @Autowired
     private RockMusic rockMusic;
     private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, RapMusic rapMusic) {
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }

    //IoC - inversion of control
    //@Autowired - внедрение зависимости music

//     @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


//     @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    //
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public List<Music> getMusicList() {
//        return musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

        public String playMusic() {
//            System.out.println("Playing: " + rockMusic.getSong());
//            System.out.println("Playing: " + rapMusic.getSong());
            return "Playing: " + rockMusic.getSong();
        }
    }


