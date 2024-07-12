package com.tokyo.game.tokyo_game;

import com.tokyo.game.tokyo_game.database.DataBaseUser;
import com.tokyo.game.tokyo_game.database.Database;
import com.tokyo.game.tokyo_game.resource.Constants;
import com.tokyo.game.tokyo_game.resource.SharedResource;
import com.tokyo.game.tokyo_game.security.password.Password;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
//
//import javax.xml.crypto.Data;
import java.sql.*;

import javafx.scene.media.Media;
import java.util.Scanner;

public class Main extends Application {
    private static Scanner input = new Scanner(System.in);
    @Override
    public void start(Stage primaryStage) throws Exception {
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (1).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (2).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (3).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (4).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (5).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (5).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (7).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (9).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (10).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (11).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (12).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (13).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (15).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (17).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (19).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (21).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (22).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (23).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (24).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (25).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (26).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (27).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (28).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (29).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (30).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (31).jpg").toExternalForm());
        Constants.getInstance().c_gamer.getPaths().add(getClass().getResource("Cards/cc (32).jpg").toExternalForm());
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Image icon = new Image(getClass().getResource("Cards/cc (20).jpg").toExternalForm());
        primaryStage.getIcons().add(icon);
        Media media = new Media(getClass().getResource(Constants.getInstance().openCreditPath).toExternalForm());
        SharedResource.getInstance().mp = new MediaPlayer(media);
        SharedResource.getInstance().mp.play();

        primaryStage.setTitle("Crown Combat");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }
//        this.paths.add(getClass().getResource("Cards/cc (4).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (2).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (3).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (4).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (5).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (23).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (24).jpg").toExternalForm());
//        this.paths.add(getClass().getResource("Cards/cc (25).jpg").toExternalForm());
//    public static void main(String[] args) {
//        launch(args);
//    }
    public static void main(String[] args) throws   SQLException {

        Thread t = new Thread(()->{
            try {
                SharedResource.getInstance().user.createTable();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        t.start();
        System.out.println(SharedResource.getInstance().user.userLogin("soroush", "abcd"));
        launch();

//        Captcha captcha = new Captcha();
//        captcha.printCaptcha();
//        EvaluteMathExpression eme = new EvaluteMathExpression();
//        System.out.println(eme.getPattern());
//        Password ps = new Password("abscsdfj");
//        System.out.println(ps.getEncryptedPassword());
//                DataBaseUser dbUser = new DataBaseUser();
//        dbUser.createTable();
//        Database.getInstance().executeQuery("Select * From users;");
//        ResultSet resultSet = Database.getInstance().executeQuery("Select * From users;");
//
//        while (resultSet.next()) {
//            int id = resultSet.getInt("id");
//            String username = resultSet.getString("username");
//            String email = resultSet.getString("email");
//            System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email);
//        }
//        String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
//
//        try (PreparedStatement pstmt = Database.getInstance().getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//            pstmt.setString(1, "use4rhsss58njame");
//            pstmt.setString(2, "jdfla;sh8j5fjl4;asjdl;fj");
//            pstmt.setString(3, "sf4djl;ahs8dj5jfl;jsf");
//
//            pstmt.executeUpdate();
//
//            try (ResultSet rs = pstmt.getGeneratedKeys()) {
//                if (rs.next()) {
//                    System.out.println(rs.getInt(1));  // Returns the generated ID
//                }
//            }
//        }
    }


}



