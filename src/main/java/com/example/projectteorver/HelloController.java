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
        System.out.println("!!!!!!!!!!!!");
        seed=random.nextInt();
        A1 ferst= new A1(seed);
        A2 two = new A2(seed);
        A3 three = new A3(seed);
        A4 four = new A4(seed);
        A8 eight = new A8(seed);
        A9 nine = new A9(seed);
        welcomeText.setText(ferst.get()+"\n"+two.get()+"\n"+three.get()+"\n"+two.aswer()+"\n"+nine.aswer()+"\n");
        System.out.println(nine.aswer());
    }
}