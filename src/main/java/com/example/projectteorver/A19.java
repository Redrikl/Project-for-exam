package com.example.projectteorver;

public class A19 extends Namber{
    int m;

    A19(int seed) {
        super(seed);
        m = rand(2, 3);
    }
    public String get(){
        return ". Случайная величина X подчинена нормальному закону распределения: " +
                "f(x)=(e^-0,01(x-2)^2)/10√π. " +
                "Определить вероятность того, что X примет значение " +
                "от 0 до 12, построить график плотности вероятности, ука" +
                "зать интервал наиболее вероятных значений [m – 3σ;" +
                " m + 3σ].";
    }
    public String aswer(){
        double s = 5 * Math.sqrt(2), a = (double)(12 - m) / s, b = (double)(-m) / s;
        return ". P = Ф(" + a + ") - Ф(" + b + ");" +
                " Интервал наиболее вероятных значений: [" + m + " - 15√2; " + m + " + 15√2].";
    }
}
