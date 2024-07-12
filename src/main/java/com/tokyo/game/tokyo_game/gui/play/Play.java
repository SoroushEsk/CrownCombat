package com.tokyo.game.tokyo_game.gui.play;

import com.tokyo.game.tokyo_game.resource.Constants;
import com.tokyo.game.tokyo_game.user.Gamer;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Play {
    @FXML
    private HBox cards, cards2;
    @FXML
    private AnchorPane main;

    private ImageView deco;
    @FXML
    public void initialize(){

        deco = new ImageView();
        deco.setFitWidth(100);
        deco.setFitHeight(150);
        deco.setPreserveRatio(true);
        Gamer gamer = Constants.getInstance().c_gamer;
        cards.getChildren().clear(); // Clear existing cards if any
        for (String card: gamer.getPaths()) {
            ImageView cardView = createCardView(card);
            cards.getChildren().add(cardView);
        }
//        for (String card: gamer.getPaths()) {
//            ImageView cardView = createCardView(card);
//            cards2.getChildren().add(cardView);
//        }
    }
    private ImageView createCardView(String card) {
        Image cardImage = new Image(card); // Assuming Card has a method getImagePath() that returns the image file path
        ImageView imageView = new ImageView(cardImage);
        imageView.setFitWidth(100);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);
        setUpDraggable(imageView);
        return imageView;
    }
    private void setUpDraggable(ImageView card) {
        final int[] index = {cards.getChildren().indexOf(card)};
        System.out.println(index[0]);
        card.setOnMousePressed(event -> {
            index[0] = cards.getChildren().indexOf(card);
            cards.getChildren().remove(card);
            cards.getChildren().add(index[0], deco);
            main.getChildren().add(card);
            card.setUserData(new double[]{event.getX(), event.getY()}); // Store initial position
        });

        card.setOnMouseDragged(event -> {
            double[] dragDelta = (double[]) card.getUserData();
            double newX = event.getSceneX() - dragDelta[0];
            double newY = event.getSceneY() - dragDelta[1];
            card.relocate(newX, newY);
        });

        card.setOnMouseReleased(event -> {
            main.getChildren().remove(card);
            cards.getChildren().remove(deco);
            cards.getChildren().add(index[0], card);
        });
    }
}
