package com.lesson.bank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class RegistrationScreen extends Application {

    private FXMLLoader fxmlLoader;
    @Override
    public void start(Stage stage) throws IOException {
        fxmlLoader = new FXMLLoader(RegistrationScreen.class.getResource("registration-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setScene(scene);

        stage.setTitle("оранжевый банк");
        stage.setResizable(false);
        stage.setOnCloseRequest(e -> System.exit(0));
        stage.show();
    }

    public RegistrationScreenController getRegistrationScreenController(){
        return fxmlLoader.getController();
    }

    public static void main(String[] args) {
        launch();
    }
}