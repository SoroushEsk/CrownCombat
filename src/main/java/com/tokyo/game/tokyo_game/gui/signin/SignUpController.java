package com.tokyo.game.tokyo_game.gui.signin;

import com.tokyo.game.tokyo_game.resource.Constants;
import com.tokyo.game.tokyo_game.security.password.recovery.Question;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {
    private String securityQuestion;
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Text signUpMessage;

    @FXML
    private TextField nickName;
    @FXML
    private Label dynamicTextLabel;
    @FXML
    private TextField email;

    @FXML
    private Button signIn;

    @FXML
    public void initialize() {
        this.securityQuestion = Question.random().getQuestion();
        this.dynamicTextLabel.setText(this.securityQuestion);
    }

    @FXML
    protected void handleSignUpButtonAction() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (password.equals(confirmPassword)) {
            if (register(username, password)) {
                signUpMessage.setText("Sign-up successful!");
                // proceed to next scene or functionality
            } else {
                signUpMessage.setText("Username already taken.");
            }
        } else {
            signUpMessage.setText("Passwords do not match.");
        }

//        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/profile.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/menu.fxml"));
//
//
        Stage stage = (Stage) signIn.getScene().getWindow();
        Scene scene = new Scene(root , Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
        stage.setScene(scene);
    }

    private boolean register(String username, String password) {
        // Replace this with your actual registration logic
        return !username.equals("existingUser");
    }
}
