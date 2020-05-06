package ru.cherniak.springlearn;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//xml config: <context:component-scan base-package="ru.cherniak.springlearn"/>
//@ComponentScan("ru.cherniak.springlearn")
//xml config: <context:property-placeholder location="classpath:musicPlayer.properties"/>
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    //Example hand made configuration:

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> listMusicType() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }


    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listMusicType());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
