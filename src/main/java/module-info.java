module com.tokyo.game.tokyo_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.xml.crypto;
    requires javafx.media;

    opens com.tokyo.game.tokyo_game to javafx.fxml;
    exports com.tokyo.game.tokyo_game;
    exports com.tokyo.game.tokyo_game.gui.signin;
    opens com.tokyo.game.tokyo_game.gui.signin to javafx.fxml;
    exports com.tokyo.game.tokyo_game.gui.login;
    opens com.tokyo.game.tokyo_game.gui.login to javafx.fxml;
    exports com.tokyo.game.tokyo_game.gui.profile;
    opens com.tokyo.game.tokyo_game.gui.profile to javafx.fxml;
    exports com.tokyo.game.tokyo_game.gui.menu;
    opens com.tokyo.game.tokyo_game.gui.menu to javafx.fxml;
    exports com.tokyo.game.tokyo_game.gui.play;
    opens com.tokyo.game.tokyo_game.gui.play to javafx.fxml;
}