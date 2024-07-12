package com.tokyo.game.tokyo_game.gui.profile;

import com.tokyo.game.tokyo_game.resource.Constants;
import com.tokyo.game.tokyo_game.user.Gamer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class GamerController {

    @FXML
    private TextField usernameField, nicknameField, emailField, levelField, hpField, xpField, coinAmountField;
    @FXML
    private TilePane cardsPane;

    private Gamer gamer;

    @FXML
    private HBox hBox;
    @FXML
    private void handleUpdateProfile() {
        // Update Gamer properties based on text fields
        gamer.setUsername(usernameField.getText());
        gamer.setNickname(nicknameField.getText());
        // More properties...
    }

    @FXML
    private void handleLoadProfile() {
        // Load Gamer data into text fields
        usernameField.setText(gamer.getUsername());
        nicknameField.setText(gamer.getNickname());
        // More properties...

        // Load cards into the TilePane
        cardsPane.getChildren().clear(); // Clear existing cards if any
        int i = 0;
        for (String card: gamer.getPaths()) {
            ImageView cardView = createCardView(card);
            cardsPane.getChildren().add(cardView);
            i++;
            if ( i >= 20) break;
        }
    }

    // Create an ImageView for each card
    private ImageView createCardView(String card) {
        Image cardImage = new Image(card); // Assuming Card has a method getImagePath() that returns the image file path
        ImageView imageView = new ImageView(cardImage);
        imageView.setFitWidth(100);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);
        setUpDraggable(imageView);
        return imageView;
    }

    public void initialize() {
        gamer = Constants.getInstance().c_gamer; // Or load from a data source


        hBox.setOnKeyPressed(event -> {
            if ( event.getCode() == KeyCode.ESCAPE){

                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/com/tokyo/game/tokyo_game/menu.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Stage stage = (Stage) hBox.getScene().getWindow();
                Scene scene = new Scene(root, Constants.getInstance().Windows_Width, Constants.getInstance().Windows_Height);
                stage.setScene(scene);
            }
        });

        hBox.setFocusTraversable(true);
    }


    private void setUpDraggable(ImageView imageView) {
        imageView.setOnMousePressed(event -> {
            System.out.println(imageView.getImage());

            imageView.setLayoutX(500);
            imageView.setLayoutY(500);
            imageView.setUserData(new double[]{event.getSceneX() - imageView.getLayoutX(), event.getSceneY() - imageView.getLayoutY()});
        });

        imageView.setOnMouseDragged(event -> {
            double[] offset = (double[]) imageView.getUserData();
            cardsPane.getChildren().remove(imageView);
            imageView.setLayoutX(event.getSceneX() - offset[0]);
            imageView.setLayoutY(event.getSceneY() - offset[1]);
        });
    }
}