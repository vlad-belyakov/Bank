package com.lesson.bank;

import com.lesson.bank.client.ClientGet;
import com.lesson.bank.client.ClientSend;
import com.lesson.bank.client.UserClient;
import com.lesson.bank.controllers.ClientController;
import com.lesson.bank.security.Validation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class RegistrationScreenController {

    public Button signInButton;
    public Button signUpButton;
    public TextField phoneNumberField;
    public PasswordField passwordField;
    public Label nickLabel;
    private AnnotationConfigApplicationContext context;

    private Validation validation;

    @FXML
    public void signUpClick(ActionEvent actionEvent) throws IOException {

        phoneNumberField.setText(phoneNumberField.getText().replace("-", ""));
        phoneNumberField.setText(phoneNumberField.getText().replace(" ", ""));

        if(validation.check(passwordField.getText(), false) &&
                validation.check(phoneNumberField.getText(), true)) {
            ClientController clientController = context.getBean("clientController", ClientController.class);
            boolean pass;
            try {
                userClient = (UserClient) clientController.getClientByPhoneNumber(phoneNumberField.getText());
                pass = true;
            } catch (RuntimeException e){
                pass = false;
            }
            if(pass){
                nickLabel.setTextFill(Color.BLACK);
                Stage stage = (Stage) signUpButton.getScene().getWindow();
                phoneNumberField.setText("");
                passwordField.setText("");
                stage.close();
                new MainScreen();
            } else {
                nickLabel.setText("Неверный логин/пароль");
                phoneNumberField.setText("");
                passwordField.setText("");
                //nickLabel.setTextFill(new Color("#FD7014"));
                nickLabel.setStyle("-fx-text-inner-color: #FD7014;");
            }
        } else {
            nickLabel.setText("Заполните все поля");
            nickLabel.setTextFill(Color.RED);
        }
    }

    @FXML
    public void signInClick(ActionEvent actionEvent) {
                Stage stage = (Stage) signUpButton.getScene().getWindow();
                stage.close();
        try {
            new SignInScreen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void initialize(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        validation = context.getBean("validation", Validation.class);
    }

}