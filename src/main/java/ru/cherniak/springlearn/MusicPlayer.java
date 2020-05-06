package ru.cherniak.springlearn;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

//@Component - сщздание бина
//@Component
public class MusicPlayer {

//    @Autowired

    final private List<Music> listMusicType;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    //    @Autowired
    public MusicPlayer(List<Music> listMusicType) {
        this.listMusicType = listMusicType;
    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public String playMusic() {
        Random random = new Random();
        return "Playing: " + listMusicType.get(random.nextInt(listMusicType.size())).getSong();
    }
}


