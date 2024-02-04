package com.lesson.bank;

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

import java.io.IOException;

public class SignInScreenController {

    public Button signInButton;
    public Button signUpButton;
    public TextField phoneNumberField;
    public PasswordField passwordField;
    public Label nickLabel;
    private Validation validation;
    private AnnotationConfigApplicationContext context;

    public void initialize(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        validation = context.getBean("validation", Validation.class);
    }

    @FXML
    public void signInClick(ActionEvent actionEvent) throws IOException {

        phoneNumberField.setText(phoneNumberField.getText().replace("-", ""));
        phoneNumberField.setText(phoneNumberField.getText().replace(" ", ""));

        if(validation.check(passwordField.getText(), false) &&
                validation.check(phoneNumberField.getText(), true)) {
            boolean pass;
            ClientController clientController = context.getBean("clientController", ClientController.class);
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
}
