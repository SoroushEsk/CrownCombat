package com.tokyo.game.tokyo_game.gui.profile;

import com.tokyo.game.tokyo_game.resource.Constants;
import com.tokyo.game.tokyo_game.user.Gamer;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import com.tokyo.game.tokyo_game.cards.Card;
import java.util.ArrayList;

public class GamerController {

    @FXML
    private TextField usernameField, nicknameField, emailField, levelField, hpField, xpField, coinAmountField;
    @FXML
    private TilePane cardsPane;

    private Gamer gamer;

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
        for (String card: gamer.getPaths()) {
            ImageView cardView = createCardView(card);
            cardsPane.getChildren().add(cardView);
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