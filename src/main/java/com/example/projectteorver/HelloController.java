package com.example.projectteorver;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    Random random = new Random();
    int seed;

    @FXML
    protected void onHelloButtonClick() {
        seed=random.nextInt();
        Ferst f= new Ferst(seed);
        Two g = new Two(seed);
        welcomeText.setText(f.get()+"\n"+g.get());

    }
}