package com.tokyo.game.tokyo_game.database;

import com.tokyo.game.tokyo_game.resource.Constants;

public class CardsType implements Query {

    private static CardsType instance;

    private final String name = Constants.getInstance().CARD_TYPE_NAME;
    private CardsType(){

    }

    public static CardsType getInstance(){
        if ( instance == null ){
            instance = new CardsType();
        }
        return instance;
    }
    @Override
    public void createTable() {
        
    }
}
