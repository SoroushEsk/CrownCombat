package com.tokyo.game.tokyo_game.gui.menu;


import com.tokyo.game.tokyo_game.resource.Constants;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    private Button profileBtn;
    @FXML
    private void handleStartGame() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/play.fxml"));
        Stage stage = (Stage) profileBtn.getScene().getWindow();
        Scene scene = new Scene(root , Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
        stage.setScene(scene);
    }

    @FXML
    private void handleSeeCards() {
        System.out.println("Viewing cards...");
        // Code to display cards
    }

    @FXML
    private void handleGameHistory() {
        System.out.println("Accessing game history...");
        // Code to display game history
    }

    @FXML
    private void handleShop() {
        System.out.println("Entering shop...");
        // Code to display shop interface
    }

    @FXML
    private void handleProfile() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/profile.fxml"));
        Stage stage = (Stage) profileBtn.getScene().getWindow();
        Scene scene = new Scene(root , Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
        stage.setScene(scene);
    }

    @FXML
    private void handleLogout() {
        System.out.println("Logging out...");
        // Code to log out
    }
}
