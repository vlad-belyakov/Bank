package com.lesson.bank;

import com.lesson.bank.client.ClientSend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationScreenController {
    @FXML
    private Label welcomeText;

    public Button signInButton;
    public Button signUpButton;
    public TextField phoneNumberField;
    public PasswordField passwordField;
    public Label nickLabel;
    private boolean pass = false;
    private boolean waiting = true;

    private ClientSend clientSend;

    /*
    @FXML
    public void signInClick(ActionEvent actionEvent) {
        if(!(phoneNumberField.getText().equals("") && passwordField.getText().equals("")
                && phoneNumberField.getText() != null && passwordField.getText() != null)) {
            clientSend.sendCommand(String.format("@getClient %s %s", phoneNumberField.getText(), passwordField.getText()));
            while (waiting){
                System.out.print("");
            }
            waiting = true;
            if(pass){
                nickLabel.setTextFill(Color.BLACK);
                Stage stage = (Stage) signUpButton.getScene().getWindow();
                userClient = new UserClient(phoneNumberField.getText(), passwordField.getText());
                userClient.setSocket(clientGet.getSocket());
                phoneNumberField.setText("");
                passwordField.setText("");
                stage.close();
                pass = false;
                new ChatScreen(userClient, clientSend, clientGet);
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
    public void signUpClick(ActionEvent actionEvent) {
        if(!(phoneNumberField.getText().equals("") && passwordField.getText().equals("")
                && phoneNumberField.getText() != null && passwordField.getText() != null)){
            clientSend.sendCommand(String.format("@createClient %s %s", phoneNumberField.getText(), passwordField.getText()));
            while (waiting){
                System.out.print("");
            }
            waiting = true;
            if(pass){
                nickLabel.setTextFill(Color.BLACK);
                userClient = new UserClient(phoneNumberField.getText(), passwordField.getText(), clientGet.getSocket());
                phoneNumberField.setText("");
                passwordField.setText("");
                Stage stage = (Stage) signUpButton.getScene().getWindow();
                stage.close();
                pass = false;
                new ChatScreen(userClient, clientSend, clientGet);
            } else {
                nickLabel.setText("Пользователь с таким логином уже существует");
                phoneNumberField.setText("");
                passwordField.setText("");
                nickLabel.setTextFill(Color.RED);
            }
        } else {
            nickLabel.setText("Заполните все поля");
            nickLabel.setTextFill(Color.RED);
        }
    }*/

    public void initialize(){
        //UserClient userClient = new UserClient();
        //clientSend = new ClientSend();
    }

    public void signInClick(ActionEvent actionEvent) {
    }

    public void signUpClick(ActionEvent actionEvent) {
    }
}