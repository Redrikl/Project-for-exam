package com.example.projectteorver;
import java.net.URL;
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
        Ferst ferst= new Ferst(seed);
        Two two = new Two(seed);
        Three three = new Three(seed);
        welcomeText.setText(ferst.get()+"\n"+two.get()+"\n"+three.get()+"\n"+two.aswer());
    }
}