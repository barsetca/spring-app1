package ru.cherniak.springlearn;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//xml config: <context:component-scan base-package="ru.cherniak.springlearn"/>
//@ComponentScan("ru.cherniak.springlearn")
//xml config: <context:property-placeholder location="classpath:musicPlayer.properties"/>
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    //Example hand made configuration:

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(), rapMusic(), classicalMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
