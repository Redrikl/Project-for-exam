package com.example.projectteorver;

public class B4 extends Namber {
    int a, b;
    B4(int seed) {
        super(seed);
        a = rand(6, 10);
        b = rand(5, 8);
    }
    public String get() {
        return "В группе 16з механического факультета учатся " + a + " юношей и " + b + " девушек. По списку в журнале наугад отобраны 4 студента. Найти вероятность того, что все из них юноши.";
    }
    public String aswer() {
        int c = a + b;
        double p = (double)(a/c) * (double)((a-1)/(c-1)) * (double)((a-2)/(c-2)) * (double)((a-3)/(c-3));
        return ". P = " + p;
    }
}
