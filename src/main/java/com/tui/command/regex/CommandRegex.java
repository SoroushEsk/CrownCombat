package com.tui.command.regex;

public class CommandRegex {

    private static CommandRegex instance;
    // user create -u <username> -p <password> <password confirmation> –email <email> -n <nickname>
    public final String CreateUser             =       "^user\\s+create\\s+-u\\s+(.+)\\s+-p\\s+(.+)\\s+(.+)\\s+–email\\s+(.+)\\s+-n\\s+(.+)\\s+$";
    public final String CreateUserRandom       =       "^user\\s+create\\s+-u\\s+(.+)\\s+-p\\s+random\\s+–email\\s+(.+)\\s+-n\\s+(.+)\\s+$";
    public final String questionPick           =       "^question\\s+pick\\s+-q\\s+(.+)\\s+-a\\s+(.+)\\s+-c\\s+(.+)\\s+$";
    public final String LoginUser              =       "^user\\s+login\\s+-u\\s+(.+)\\s+-p\\s+(.+)\\s+$";
    public final String logout                 =       "^log\\s+out$";
    public final String forgetpassword         =       "^Forgot\\s+my\\s+password\\s+-u\\s+(.+)\\s+$";
    public final String showInfo               =       "^Show\\s+information$";
    public final String changeUsername          =       "^Profile\\s+change\\s+-u\\s+(.+)\\s+$";
    public final String changeNickname          =       "^Profile\\s+change\\s+-n\\s+(.+)\\s+$";
    public final String changeEmail             =       "^Profile\\s+change\\s+-e\\s+(.+)\\s+$";
    public final String changePassword          =       "^profile\\\\s+change\\\\s+password\\\\s+-o\\\\s+(.+)\\\\s+-n\\\\s+(.+)\\\\s*$";
    public final String adminLogin              =       "^login\\s+admin\\s+(.+)$";


    private CommandRegex(){}

    public static CommandRegex getInstance(){
        if ( instance == null ){
            instance = new CommandRegex();
        }
        return instance;
    }
}
