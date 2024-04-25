package com.example.projectteorver;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    Random random = new Random();

    @FXML
    protected void onHelloButtonClick() {
        Namber f= new Namber(random.nextInt());
        welcomeText.setText(f.get());

    }
}