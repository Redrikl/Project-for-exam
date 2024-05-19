package com.example.projectteorver;
import java.util.*;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import java.util.Random;

public class ControllerTest {

        int seed;
        @FXML
        private Slider slider1;
        @FXML
        private TextField adres;
        @FXML
        private CheckBox check1;
        @FXML
        private CheckBox check2;
        @FXML
        private CheckBox check3;
        @FXML
        private CheckBox check4;
        @FXML
        private CheckBox check5;
        @FXML
        private CheckBox check6;
        @FXML
        private CheckBox check7;
        @FXML
        private CheckBox check8;
        @FXML
        private CheckBox check9;
        @FXML
        private CheckBox check10;
        @FXML
        private CheckBox check11;
        @FXML
        private CheckBox check12;
        @FXML
        private CheckBox check13;
        @FXML
        private CheckBox check14;
        @FXML
        private CheckBox check15;
        @FXML
        private CheckBox check16;
        @FXML
        private CheckBox check17;
        @FXML
        private CheckBox check18;
        @FXML
        private CheckBox check19;
        @FXML
        private CheckBox check20;
        @FXML
        protected void genereter() {
            System.out.println("!!!!!!!!!!!!");
            boolean[] check=new boolean[20];

            check[0]=check1.isSelected();
            check[1]=check2.isSelected();
            check[2]=check3.isSelected();
            check[3]=check4.isSelected();
            check[4]=check5.isSelected();
            check[5]=check6.isSelected();
            check[6]=check7.isSelected();
            check[7]=check8.isSelected();
            check[8]=check9.isSelected();
            check[9]=check10.isSelected();
            check[10]=check11.isSelected();
            check[11]=check12.isSelected();
            check[12]=check13.isSelected();
            check[13]=check14.isSelected();
            check[14]=check15.isSelected();
            check[15]=check16.isSelected();
            check[16]=check17.isSelected();
            check[17]=check18.isSelected();
            check[18]=check19.isSelected();
            check[19]=check20.isSelected();
            for (int i=0;i<(int) slider1.getValue();i++){
                Random random = new Random();
                seed=Math.abs(random.nextInt());
                WordWorker worker = new WordWorker(seed);
                 worker.createVariant(adres.getText(),check);
            }
        //System.out.println((int)slider1.getValue());

        }
        @FXML
        protected void onHelloButtonClick() {
       System.out.println("!!!!!!!!!!!!");

    }

    }
