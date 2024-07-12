package com.tokyo.game.tokyo_game.resource;

import com.tokyo.game.tokyo_game.security.password.Password;
import com.tokyo.game.tokyo_game.security.password.recovery.PasswordRecovery;
import com.tokyo.game.tokyo_game.user.Gamer;
import com.tokyo.game.tokyo_game.user.email.Email;

public class Constants {

    private static Constants instance;


    public String CARD_TYPE_NAME   = "card_type";
    public long Windows_Width = 1200;
    public long Windows_Height = 800;
    public Gamer c_gamer;
    public String openCreditPath = "music/Opening_Credits_Game_of_Thrones_Season_8_HBO_TZE9gVF1QbA_140.mp3";

    private Constants(){}


    public static Constants getInstance(){
        if ( instance == null ){
            instance = new Constants();
            instance.c_gamer = new Gamer(1, "Soroush",new Password("fuckyou"), "nickname", new Email("s", "gmal", "com"), new PasswordRecovery());
        }
        return instance;

    }

}
