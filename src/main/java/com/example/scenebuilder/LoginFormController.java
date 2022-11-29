package com.example.scenebuilder;



import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

public class LoginFormController {

    final String username = "peter";
    final String password = "peter123";

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private Label txtLoginResult;

    @FXML
    private Label forgotPasswordLB;

    @FXML
    private CheckBox rememberMeCB;

    @FXML
    public void loginBtnHandler() {
        String usernameEntered = usernameField.getText();
        String passwordEntered = passwordField.getText();
        if (usernameEntered.equals(username) && passwordEntered.equals(password)) {
            String msg = "Login successful";
            if (rememberMeCB.isSelected()) {
                msg += ", Your information is saved";
            }
            txtLoginResult.setTextFill(Color.web("#00ff44"));
            txtLoginResult.setText(msg);
        } else {
            txtLoginResult.setText("Invalid information");
            txtLoginResult.setTextFill(Color.web("#ff0000"));
        }
    }

    @FXML
    public void forgotPasswordLBEnterHandler() {
        forgotPasswordLB.setTextFill(Color.web("#1378d6"));
        forgotPasswordLB.setUnderline(true);
        forgotPasswordLB.setCursor(Cursor.HAND);
    }

    @FXML
    public void forgotPasswordLBExitHandler() {
        forgotPasswordLB.setTextFill(Color.web("#000000"));
        forgotPasswordLB.setUnderline(false);
        forgotPasswordLB.setCursor(Cursor.DEFAULT);

    }

}

