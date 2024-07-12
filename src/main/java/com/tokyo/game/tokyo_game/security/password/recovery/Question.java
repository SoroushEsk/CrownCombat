package com.tokyo.game.tokyo_game.security.password.recovery;

import com.tokyo.game.tokyo_game.resource.SharedResource;

import java.util.Random;

public enum Question {
    FATHERS_NAME("What is your father’s name?"),
    FAVOURITE_COLOR("What is your favourite color?"),
    FIRST_PET_NAME("What was the name of your first pet?");

    private final String question;
    public static final int Number_Question = 3;
    Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }
    public static Question random(){
        switch (SharedResource.getInstance().randomPositiveInt(Number_Question)){
            case 0:
                return FATHERS_NAME;
            case 1:
                return FAVOURITE_COLOR;
            case 2:
                return FIRST_PET_NAME;
            default:return null;
        }

    }
}
