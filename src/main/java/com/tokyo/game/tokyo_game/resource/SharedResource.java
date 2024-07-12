package com.tokyo.game.tokyo_game.resource;

import com.tokyo.game.tokyo_game.database.DataBaseUser;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SharedResource {
    private static SharedResource instance;

    private final Scanner input = new Scanner(System.in);
    private final Random  random = new Random();
    public  MediaPlayer mp;

    public DataBaseUser user = new DataBaseUser();


    private SharedResource() {
    }


    public String scannerGetLine(){
        return input.nextLine();
    }

    public Matcher getMatcher(String input, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
    public static SharedResource getInstance(){
        if ( instance == null ){
            instance = new SharedResource();
        }
        return instance;
    }

    public  int randomPositiveInt(int len){
        return Math.abs(random.nextInt())%len;
    }
}
