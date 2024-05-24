package com.example.projectteorver;

public class A15 extends Namber{
    A15(int seed) {
        super(seed);
    }
    public String get(){
        return ". Дана функция распределения F(x) непрерывной слу\n" +
                "чайной величины X.\n" +
                "Требуется:\n" +
                "1) найти плотность вероятности f(x);\n" +
                "2) построить графики F(x) и f(x);\n" +
                "3) найти M(X), D(X), 3(Х);\n" +
                "4) найти Р(4< X < 5) для данных 4, 5.\n" +
                "F(x)= ||||||||0, x<=0;\n"+
                               "sin3x,0<x<=п/6;\n"+
                "1,x>п/6;\n"+
                "a=0;,B=п/12;\n";

    };
}
