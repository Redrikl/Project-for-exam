package com.example.projectteorver;

public class A19 extends Namber{
    A19(int seed) {
        super(seed);
    }
    public String get(){
        return ". Случайная величина X подчинена нормальному закону распределения:\n" +
                "f(x)=(e^-0,01(x-2)^2)/10√π"+
                "Определить вероятность того, что X примет значение\n" +
                "от 0 до 12, построить график плотности вероятности, ука-\n" +
                "зать интервал наиболее вероятных значений [m – 32;\n" +
                "m + 32].";
    }
    public String aswer(){
        return "Среднее значение времени T="+1/vero;
    }
}
