package com.example.projectteorver;

public class A7 extends Namber{
    double vero1;
    double vero2;
    double vero3;
    double vero4;
    A7(int seed) {
        super(seed);
        vsego = rand(4,7);
        vero1=(double) rand(6,8)/10;
        vero2=(double) rand(3,5)/10;
        vero3=(double) rand(1,3)/10;
        vero4=(double) rand(4,8)/10;
    }


    @Override
    public String get(){

        return ". Во дворе выгуливают двух чау-чау, трех мопсов, двух\n" +
                "спаниелей и одного ньюфаундленда. Мопс облаивает про\n" +
                "ходящую мимо дворничиху с вероятностью "+vero1+", спани" +
                "ель — "+vero2+", ньюфаундленд — "+vero3+", чау-чау вообще не любит\n" +
                "лаять. Сегодня утром дворничиху облаяла собака. Какой\n" +
                "породы вероятнее всего она была?";
    };
    public String aswer() {
        return ". "+"Мопс\n";
    }
}