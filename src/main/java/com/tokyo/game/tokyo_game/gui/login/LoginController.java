package com.tokyo.game.tokyo_game.gui.login;

import com.tokyo.game.tokyo_game.resource.Constants;
import com.tokyo.game.tokyo_game.resource.SharedResource;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
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
    private Button signup, loginBtn;
    @FXML
    public void initialize(){
        passwordField.setOnKeyPressed(even->{
            if ( even.getCode() == KeyCode.ENTER){
                try {
                    handleLoginButtonAction();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    @FXML
    protected void handleLoginButtonAction() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (SharedResource.getInstance().user.userLogin(username, password)){
            //        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/profile.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/menu.fxml"));
//
//
            Stage stage = (Stage) loginBtn.getScene().getWindow();
            Scene scene = new Scene(root , Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
            stage.setScene(scene);
        }else{
            loginMessage.setText("Username or Password Invalid");
        }
    }


    @FXML
    protected void onSignupAction() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/signin.fxml"));


        Stage stage = (Stage) signup.getScene().getWindow();
        Scene scene = new Scene(root , Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
        stage.setScene(scene);

    }
}
