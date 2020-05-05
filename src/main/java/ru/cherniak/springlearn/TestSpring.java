package ru.cherniak.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

//        Music classicalBean = context.getBean("classicalBean", Music.class);
//        Music rockBean = context.getBean("rockBean", Music.class);
//        Music rapBean = context.getBean("rapBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(musicBean); from Dependency injection =
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        //scope = singleton boolean compareBean -> true and hash ==
        //scope = prototype boolean compareBean -> false and hash !=
        boolean compareBean = firstMusicPlayer == secondMusicPlayer;

        System.out.println(compareBean);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        //scope = singleton changing first change second
        //scope = prototype changing first no change second

        firstMusicPlayer.setVolume(10);
        System.out.println("firstVolume: " + firstMusicPlayer.getVolume());
        System.out.println("secondVolume: " + secondMusicPlayer.getVolume());


        firstMusicPlayer.playMusic();

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        context.close();
    }
}
