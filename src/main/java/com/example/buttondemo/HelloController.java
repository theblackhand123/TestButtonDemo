package com.example.buttondemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onLeftButtonClick() {
        welcomeText.setTranslateX(welcomeText.getTranslateX() - 10);
    }
    @FXML
    protected void onRightButtonClick() {
        welcomeText.setTranslateX(welcomeText.getTranslateX() + 10);
    }

}