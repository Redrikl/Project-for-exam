package com.example.projectteorver;

import java.util.*;
public class Namber {
    int vsego;
    int chast;
    Random r;
    Namber(int seed){
        r = new Random();
        r.setSeed(seed);
    }
    public int rand(int min,int max){
        if(max<min)return 0;
        return Math.abs(r.nextInt()%(max+1-min))+min;
    }
    public String get(){
        vsego = Math.abs(r.nextInt()%30)+4;
        chast = Math.abs(r.nextInt()%(vsego/2))+2;
        return "1. На сортировочном пункте в ожидании подачи на\n"+
                " подъездной путь стоят " + vsego +" вагонов для разных направлений.\n"+
                " Найти вероятность того, что в нужном порядке стоят:\n"+
                "а) все вагоны;\n" +
                "б) первые "+ chast+" вагона.";
    };

    public String aswer() {
       return "a) 1/("+vsego+"!)"+" b) "+ chast+"!/"+vsego+"!/";
    }
}