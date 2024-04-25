package com.example.projectteorver;

import java.util.Random;

public class Two extends Namber {
    Two(int seed) {
        super(seed);
    }

    public String get(){
        vsego = rand(1,6);
        chast = Math.abs(r.nextInt()%(vsego/2))+2;
        return ". В группе из "+vsego+" человек трое занимаются армрестлин-+\n" +
                "гом, 10 — бодибилдингом, 5 — кикбоксингом, осталь+\n" +
                "ные — пауэр+лифтингом. Какова вероятность того, что\n" +
                "среди трех наугад вызванных спортсменов:\n" +
                "а) хотя бы один занимается бодибилдингом;\n" +
                "б) один занимается армрестлингом, а другие два —\n" +
                "кикбоксингом?";
    };

    public String aswer() {
        return "a) 1/("+vsego+"!)"+" b) "+ chast+"!/"+vsego+"!/";
    }
}
