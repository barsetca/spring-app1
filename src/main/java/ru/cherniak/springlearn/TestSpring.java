package ru.cherniak.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");


//        Music rockBean = context.getBean("rockMusic", Music.class);
//        Music classicalBean = context.getBean("classicalMusic", Music.class);
//        Music rapBean = context.getBean("rapMusic", Music.class);



//        MusicPlayer musicPlayer1 = new MusicPlayer(rockBean);
//        MusicPlayer musicPlayer2 = new MusicPlayer(classicalBean);
//        MusicPlayer musicPlayer3 = new MusicPlayer(rapBean);

        /*
        Пометив MusicPlayer аннотациями @Component и @Autowired мы создаем бин через контекст спринга
         */

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer" , MusicPlayer.class);
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//        musicPlayer3.playMusic();

 //       if have Computer
        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);
        context.close();
    }
}
