package ru.cherniak.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

//        Music classicalBean = context.getBean("classicalBean", Music.class);
//        Music rockBean = context.getBean("rockBean", Music.class);
//        Music rapBean = context.getBean("rapBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(musicBean); from Dependency injection =
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
