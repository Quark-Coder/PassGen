package com.programs.PassGen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PassGenApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PassGenApplication.class.getResource("passgen-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PassGen");
        stage.setScene(scene);
        stage.setWidth(600);
        stage.setHeight(300);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}