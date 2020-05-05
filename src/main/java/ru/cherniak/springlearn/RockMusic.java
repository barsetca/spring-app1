package ru.cherniak.springlearn;

public class RockMusic implements Music{

    //Pattern factory method

// for using factory-method in spring context need have private constructor
    // for prohibit create object using new
    private RockMusic() {
    }

    //factory method
    public static RockMusic getRockMusic(){
        System.out.println(" factory-method getRockMusic()");
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "RockStar song";
    }
}
