package com.tui.respond.massage;

public class OutputMassage {
    private static OutputMassage instance;
    //region Error
    public String usernameEmpty                 = "Error: Username is required.";
    public String passwordEmpty                 = "Error: Password is required.";
    public String passwordConfirmEmpty          = "Error: Password confirmation is required.";
    public String passwordNotMatch              = "Error: Password confirmation is required.";
    public String emptyEmail                    = "Error: Email is required.";
    public String emptyNickname                 = "Error: Nickname is required.";
    public String securityQuestionNumberEmpty   = "Error: Question number is required.";
    public String questionAnswerEmpty           = "Error: Answer is required.";
    public String questionAnswerConfirmEmpty    = "Error: Answer confirmation is required.";
    public String questionAnswerNotMatch        = "Error: Answers do not match.";
    public String unValidUsernameFormat         = "Error: Not valid question number format.";
    public String duplicateUsername             = "Error: Username already exists.";
    public String usernameNotExist              = "Error: Username doesn’t exist!";
    public String passwordTooShort              = "Error: Password must be at least 8 characters long.";
    public String passwordWeak                  = "Error: Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character.";
    public String invalidEmailFormat            = "Error: Invalid email format. The correct format is <email>@<domain>.com.";
    public String passwordIncorrect             = "Error: Password and Username don’t match!";
    public String oldPasswordMismatch           = "Error: The old password does not match.";
    public String newPasswordSameAsOld          = "Error: The new password cannot be the same as the old password.";
    public String reEnterPassword               = "Please re-enter your password:";
    public String answerToSecurityQuestion      = "Please enter your answer to \"%s\"";
    //endregion

    //region Success Massage
    public String userCreateSuccess = "User created successfully.";
    public String securityQuestion = "Please choose a security question : ";
    public String randomPassword   = "Your random password:";
    public String userLoginSuccess = "user logged in successfully!";
    public String successfulUsernameUpdate = "Success: Username updated successfully.";
    public String successfulNicknameUpdate = "Success: Nickname updated successfully.";
    public String endterPasswordAgain       = "Please enter your new password again";


    //endregion

    //region Format Message
    public String passwordTryAgain = "Try again in %n seconds";
    //endregion
    private OutputMassage(){}

    public static OutputMassage getInstance(){
        if ( instance == null ){
            instance = new OutputMassage();
        }
        return instance;


    }
}
