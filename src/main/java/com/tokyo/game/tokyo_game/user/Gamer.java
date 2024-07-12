package com.tokyo.game.tokyo_game.user;

import com.tokyo.game.tokyo_game.cards.Card;
import com.tokyo.game.tokyo_game.security.password.Password;
import com.tokyo.game.tokyo_game.security.password.recovery.PasswordRecovery;
import com.tokyo.game.tokyo_game.user.email.Email;

import java.util.ArrayList;

public class Gamer {
    private long ID;
    private String username;
    private Password password;

    public Gamer(long ID, String username, Password password, String nickname, Email email, PasswordRecovery recoveryQuestion) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.recoveryQuestion = recoveryQuestion;
        this.paths = new ArrayList<>();
    }

    private String nickname;
    private Email email;
    private PasswordRecovery recoveryQuestion;
    private long level;
    private long HP;
    private long XP;
    private long coinAmount;


    private ArrayList<String> paths;
    private ArrayList<Card> cards;


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public PasswordRecovery getRecoveryQuestion() {
        return recoveryQuestion;
    }

    public void setRecoveryQuestion(PasswordRecovery recoveryQuestion) {
        this.recoveryQuestion = recoveryQuestion;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public long getHP() {
        return HP;
    }

    public void setHP(long HP) {
        this.HP = HP;
    }

    public long getXP() {
        return XP;
    }

    public void setXP(long XP) {
        this.XP = XP;
    }

    public long getCoinAmount() {
        return coinAmount;
    }

    public void setCoinAmount(long coinAmount) {
        this.coinAmount = coinAmount;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }

    public void setPaths(ArrayList<String> paths) {
        this.paths = paths;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
