package com.example.projectteorver;

import java.util.Random;

public class Two extends Namber {
    Two(int seed) {
        super(seed);
    }
    int a;
    int b;
    int k;
    int p;
    public String get(){
        vsego = rand(20,30);
        a = rand(3,vsego/3);
        b = rand(3,vsego-a-vsego/3);
        k = rand(3,vsego-a-b);
        p = vsego-a-b-k;
        return ". В группе из "+vsego+" человек "+a+" занимаются армрестлин-\n" +
                "гом, "+b+" — бодибилдингом, "+k+" — кикбоксингом, осталь-\n" +
                "ные — пауэрлифтингом. Какова вероятность того, что\n" +
                "среди трех наугад вызванных спортсменов:\n" +
                "а) хотя бы один занимается бодибилдингом;\n" +
                "б) один занимается армрестлингом, а другие два —\n" +
                "кикбоксингом?";
    };

    public String aswer() {
        return "a) 1/("+vsego+"!)"+" b) "+ chast+"!/"+vsego+"!/";
    }
}
