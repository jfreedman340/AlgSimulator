package edu.redwoods.cis12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class LinearSimulator extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("algsimulator.fxml"));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mySimulator.fxml")));

        Scene scene = new Scene(root);
        stage.setTitle("Joseph Freedman");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
