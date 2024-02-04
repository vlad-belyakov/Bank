package com.lesson.bank;

import com.lesson.bank.client.ClientGet;
import com.lesson.bank.client.ClientSend;
import com.lesson.bank.client.UserClient;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MainScreen {

    private FXMLLoader fxmlLoader;

    public MainScreen() throws IOException {
        fxmlLoader = new FXMLLoader(RegistrationScreen.class.getResource("main-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("оранжевый банк");
        stage.setResizable(false);
        stage.setOnCloseRequest(e -> System.exit(0));
        stage.show();
    }

    public MainScreenController getMainScreenController(){
        return fxmlLoader.getController();
    }

}

