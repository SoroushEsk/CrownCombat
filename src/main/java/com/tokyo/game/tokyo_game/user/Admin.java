package com.tokyo.game.tokyo_game.user;

import com.tokyo.game.tokyo_game.security.password.Password;
import com.tokyo.game.tokyo_game.security.password.recovery.PasswordRecovery;
import com.tokyo.game.tokyo_game.user.email.Email;

public class Admin extends Gamer{
    private Password password;


    public Admin(long ID, String username, Password password, String nickname, Email email, PasswordRecovery recoveryQuestion) {
        super(ID, username, password, nickname, email, recoveryQuestion);
    }
}


