package com.example.projectteorver;

public class A15 extends Namber{
    private double g1;
    private double g2;
    private double g3;
    A15(int seed) {
        super(seed);
        g1=rand(-5,-1);
        g2=rand((int)g1,1);
        g3=rand((int)g2,4);
    }
    public String get(){
        return ". Дана функция распределения F(x) непрерывной случайной величины X.\n" +
                "Требуется:                                                                                                                                                                 "+
                "1) найти плотность вероятности f(x);                                                                                                                                                                 "+
                "2) найти M(X), D(X), σ(Х);                                                                                                                                                                 "+
                "3) найти Р(α< X < β) для данных α, β.                                                                                                                                                               "+
                ".         |     0,    x≤0;                                                                                                                                                          "+
                "F(x)= |     sin3x, 0<x≤π/6;                                                                                                                                                                  "+
                ".         |     1,  x>π/6;                                                                                                                                                                                    "+
                "α=0; β=п/12;";

    };
    public String aswer(){
        return "";
    }
}
