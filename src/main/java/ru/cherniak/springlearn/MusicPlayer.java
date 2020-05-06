package ru.cherniak.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component - сщздание бина
//@Component
public class MusicPlayer {

//    @Autowired

     private Music music1;
     private Music music2;
     private Music music3;

     @Value("${musicPlayer.name}")
     private String name;
    @Value("${musicPlayer.volume}")
     private int volume;



//    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("rapMusic")Music music2, @Qualifier("classicalMusic")Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
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

    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public int getVolume() {
        return volume;
    }
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
            return "Playing: " + music1.getSong() + " " + music2.getSong() + " " + music3.getSong();
        }
    }


