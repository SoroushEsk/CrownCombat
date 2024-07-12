package com.tokyo.game.tokyo_game.gui.login;

import com.tokyo.game.tokyo_game.resource.Constants;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Text loginMessage;

    @FXML
    private Button signup;

    @FXML
    protected void handleLoginButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (authenticate(username, password)) {
            loginMessage.setText("Login successful!");
            // proceed to next scene or functionality
        } else {
            loginMessage.setText("Invalid username or password.");
        }
    }


    @FXML
    protected void onSignupAction() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/signin.fxml"));


        Stage stage = (Stage) signup.getScene().getWindow();
        Scene scene = new Scene(root , Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
        stage.setScene(scene);

    }
    private boolean authenticate(String username, String password) {
        // Replace this with your actual authentication logic
        return "user".equals(username) && "password".equals(password);
    }
}
