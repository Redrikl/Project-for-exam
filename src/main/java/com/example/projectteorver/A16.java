package com.example.projectteorver;

public class A16 extends Namber{
    private double g1;
    private double g2;
    private double g3;
    A16(int seed) {
        super(seed);
        g1=rand(-5,-1);
        g2=rand((int)g1,1);
        g3=rand((int)g2,4);
    }
    public String get(){
        return  ". Дана плотность вероятности f(x) непрерывной случайной величины X, имеющая две ненулевые составляющие" +
                "формулы. Требуется:                                                                                                         " +
                "1) проверить свойство ∫f(x)dx = 1, где итеграл от -∞ до +∞;\n" +
                "2) найти функцию распределения F(x);\n" +
                "3) найти Р(α≤X≤β) для данных α,β;\n" +
                "4) найти М(Х), D(X), σ(X).                                                                                                                                                                   "+
                ".     |             0,     x≤-"+g1+";                                                                                                                                                        "+
                ".     | (3/16)(x+2)^2,   "+g1+"<x≤"+g2+";                                                                                                                                                    "+
                "f(x)= | (3/16)(x-2)^2,    "+g2+"<x≤"+g3+";                                                                                                                                                   "+
                ".     |             0,      x>"+g3+";                                                                                                                                                        ";
    }
    public String aswer(){
return "";
    }
}
